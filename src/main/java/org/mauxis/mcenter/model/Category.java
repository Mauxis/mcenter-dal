package org.mauxis.mcenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="categories", schema="mcenter")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CATEGORY_ID_GENERATOR" )
    @SequenceGenerator(name = "CATEGORY_ID_GENERATOR", sequenceName = "mcenter.seq_category", allocationSize = 1, initialValue = 1)
    private Long id;

    @Column(name="code")
    private String code;

    @Column(name="name")
    private String name;

    public Category(String name) {
        this.name = name;
    }
}
