package com.relaciones.demoRelaciones.entidades.OneToOneBi;

import com.relaciones.demoRelaciones.entidades.Domicilio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "domicilio_id")
    private Domicilio2 domicilio;
}
