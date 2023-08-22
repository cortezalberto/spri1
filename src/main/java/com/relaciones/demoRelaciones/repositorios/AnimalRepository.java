package com.relaciones.demoRelaciones.repositorios;

import com.relaciones.demoRelaciones.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal,Long> {
}
