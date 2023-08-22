package com.relaciones.demoRelaciones.entidades.OneToOneBi;

import com.relaciones.demoRelaciones.entidades.PersonaBi;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Domicilio2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "domicilio")
    private Persona2 persona;
}
