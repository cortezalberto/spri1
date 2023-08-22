package com.relaciones.demoRelaciones.repositorios;

import com.relaciones.demoRelaciones.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
}
