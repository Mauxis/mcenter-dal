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
@Table(name="types", schema="mcenter")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "TYPES_ID_GENERATOR" )
    @SequenceGenerator(name = "TYPES_ID_GENERATOR", sequenceName = "mcenter.seq_type", allocationSize = 1, initialValue = 1)
    private Long id;

    @Column(name="name", nullable=false)
    private String name;

    private String description;

}
