package com.relaciones.demoRelaciones;

import com.relaciones.demoRelaciones.repositorios.AnimalRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoRelacionesApplication {

	public static void main(String[] args) {

		System.out.println("-----------------Corriendo--------------");
		ConfigurableApplicationContext context = SpringApplication.run(DemoRelacionesApplication.class, args);

		// Crear un objeto Animal
		Animal animal = new Animal();
		animal.setNombre("León");
		animal.setEspecie("Panthera leo");

		// Guardar el objeto Animal en la base de datos
		AnimalRepository animalRepository = context.getBean(AnimalRepository.class);
		animalRepository.save(animal);

		// Recuperar el objeto Animal desde la base de datos
		Animal animalRecuperado = animalRepository.findById(animal.getId()).orElse(null);
		if (animalRecuperado != null) {
			System.out.println("Nombre del animal: " + animalRecuperado.getNombre());
			System.out.println("Especie del animal: " + animalRecuperado.getEspecie());
		}

		context.close();
	}
}
