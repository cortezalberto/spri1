package com.relaciones.demoRelaciones.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Universidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    /* En una relación unidireccional @OneToMany,
     la anotación @JoinColumn hace referencia a la tabla en
     base de datos del many (student en este caso).
     Por este motivo, vemos en la siguiente imagen @JoinColumn
     en la clase University.
     La clase Student únicamente tendrá los atributos id y name.
     */
    @JoinColumn(name = "universidad_id")
    private List<Estudiante> listaEstudiantes = new ArrayList<>();

}
