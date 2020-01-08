package com.example.estudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EstudianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudianteApplication.class, args);
	}

}
