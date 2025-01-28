package org.mauxis.mcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product_categories", schema="mcenter")
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PRODUCT_CATEGORY_ID_GENERATOR" )
    @SequenceGenerator(name = "PRODUCT_CATEGORY_ID_GENERATOR", sequenceName = "mcenter.seq_product_category", allocationSize = 1, initialValue = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name="product_id", nullable=false)
    private Product product;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;
}
