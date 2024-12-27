package org.mauxis.mcenter.model;

import jakarta.persistence.*;

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

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
