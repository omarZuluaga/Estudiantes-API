package com.example.estudiante.infraestructura.repositroy.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estudiante.infraestructura.dto.CursoDto;

public interface CursoRepository extends JpaRepository<CursoDto, String> {

}
