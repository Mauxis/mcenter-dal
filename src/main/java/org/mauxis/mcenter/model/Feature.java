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
@Table(name="features", schema="mcenter")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "FEATURES_ID_GENERATOR" )
    @SequenceGenerator(name = "FEATURES_ID_GENERATOR", sequenceName = "mcenter.seq_feature", allocationSize = 1, initialValue = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name="type_id", nullable=false) //Segun type se sabe si es RAM, Proce, Grafica, etc.
    private Type type;

    @Column(name="key", nullable = false) //Las key son el nombre del feature: capacidad, frecuencia, voltaje...
    private String key;

    @Column(name="value", nullable = false) //Value sería el valor: 12, 24, 32...
    private Long value;

    @Column(name="unit_type", nullable = false)
    private String unitType;


    // TODO: A futuro hay que validar cantidades realistas y validar la unidad de medida correcta.

}
