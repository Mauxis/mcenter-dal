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
@Table(name="product_types", schema="mcenter")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PRODUCT_TYPE_ID_GENERATOR" )
    @SequenceGenerator(name = "PRODUCT_TYPE_ID_GENERATOR", sequenceName = "mcenter.seq_product_type", allocationSize = 1, initialValue = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;

    @ManyToOne
    @JoinColumn(name="type_id", nullable=false)
    private Type type;
}
