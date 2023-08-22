package com.relaciones.demoRelaciones.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PersonaBi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "domicilio_id")
// el lado propietario es donde va el FK
    private DomicilioBi domicilio;


}
