package com.relaciones.demoRelaciones.repositorios;

import com.relaciones.demoRelaciones.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
