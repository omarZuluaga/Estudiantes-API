package com.example.estudiante.infraestructura.repositroy.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estudiante.infraestructura.dto.EstudianteDto;

public interface EstudianteRepository extends JpaRepository<EstudianteDto, String>{

}
