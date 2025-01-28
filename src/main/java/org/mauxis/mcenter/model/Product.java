package org.mauxis.mcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products", schema="mcenter")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PRODUCTS_ID_GENERATOR" )
    @SequenceGenerator(name = "PRODUCTS_ID_GENERATOR", sequenceName = "mcenter.seq_product", allocationSize = 1, initialValue = 1)
    private Long id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="brand", nullable=false)
    private String brand;

}
