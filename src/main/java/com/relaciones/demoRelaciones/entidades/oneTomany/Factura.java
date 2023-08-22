package com.relaciones.demoRelaciones.entidades.oneTomany;

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
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    // En la table origen , le digo quien me referEncia
    @JoinColumn(name = "factura_id")
    private List<DetalleFactura> LinstaDetalles = new ArrayList<>();
}
