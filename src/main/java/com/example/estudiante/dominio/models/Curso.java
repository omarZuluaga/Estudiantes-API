package com.example.estudiante.dominio.models;

import java.util.List;

import com.example.estudiante.shared.dominio.CodigoCursos;
import com.example.estudiante.shared.dominio.HorasSemanales;
import com.example.estudiante.shared.dominio.Id;
import com.example.estudiante.shared.dominio.Nombre;

public class Curso {
	private final Id id;
	private final CodigoCursos codigoCursos;
	private final Nombre nombreCurso;
	private final HorasSemanales horasSemanales;
	private final List<Estudiante> estudiantes;
	
	public Curso(Id id, CodigoCursos codigoCursos, Nombre nombreCurso, HorasSemanales horasSemanales,
			List<Estudiante> estudiantes) {
		this.id = id;
		this.codigoCursos = codigoCursos;
		this.nombreCurso = nombreCurso;
		this.horasSemanales = horasSemanales;
		this.estudiantes = estudiantes;
	}

	public Id getId() {
		return id;
	}

	public CodigoCursos getCodigoCursos() {
		return codigoCursos;
	}

	public Nombre getNombreCurso() {
		return nombreCurso;
	}

	public HorasSemanales getHorasSemanales() {
		return horasSemanales;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	
	public static Curso of(Id id, CodigoCursos codigoCursos, Nombre nombreCurso, HorasSemanales horasSemanales, 
			List<Estudiante> estudiantes) {
		return new Curso(id, codigoCursos, nombreCurso, horasSemanales, estudiantes);
	}
}
