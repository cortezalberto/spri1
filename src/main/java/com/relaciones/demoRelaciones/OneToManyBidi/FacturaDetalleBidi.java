package com.relaciones.demoRelaciones.OneToManyBidi;


import com.relaciones.demoRelaciones.entidades.oneTomany.Factura;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class FacturaDetalleBidi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "factura_id")
    private Facturabidi factura;



}
