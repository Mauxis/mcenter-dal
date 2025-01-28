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
@Table(name="product_providers", schema="mcenter")
public class ProductProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PRODUCT_PROVIDER_ID_GENERATOR" )
    @SequenceGenerator(name = "PRODUCT_PROVIDER_ID_GENERATOR", sequenceName = "mcenter.seq_product_provider", allocationSize = 1, initialValue = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;

    @ManyToOne
    @JoinColumn(name="provider_id", nullable=false)
    private Provider provider;

}
