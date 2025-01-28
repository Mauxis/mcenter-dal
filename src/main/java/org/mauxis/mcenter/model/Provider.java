package org.mauxis.mcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="providers", schema="mcenter")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PROVIDERS_ID_GENERATOR" )
    @SequenceGenerator(name = "PROVIDERS_ID_GENERATOR", sequenceName = "mcenter.seq_provider", allocationSize = 1, initialValue = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;

    @ManyToOne
    @JoinColumn(name="provider_id", nullable=false)
    private Provider provider;

    @Column(name="price", nullable = false)
    private Long price;

    @Column(name="available", nullable=false)
    private boolean isAvailable;
}
