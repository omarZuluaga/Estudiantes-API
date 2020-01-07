package com.example.estudiante.dominio.models;

import com.example.estudiante.shared.dominio.CodigoEstudiante;
import com.example.estudiante.shared.dominio.Edad;
import com.example.estudiante.shared.dominio.Grado;
import com.example.estudiante.shared.dominio.Id;
import com.example.estudiante.shared.dominio.Nombre;
import com.example.estudiante.shared.dominio.NumCursos;


public class Estudiante {
	private final Id id;
	private final CodigoEstudiante codigoEstudiante;
	private final Nombre nombre;
	private final Edad edad;
	private final Grado grado; 
	private final NumCursos numCursos;
	
	public Estudiante(Id id, CodigoEstudiante codigoEstudiante, Nombre nombre, Edad edad, Grado grado,
			NumCursos numCursos) {
		
		this.id = id;
		this.codigoEstudiante = codigoEstudiante;
		this.nombre = nombre;
		this.edad = edad;
		this.grado = grado;
		this.numCursos = numCursos;
	}

	public Id getId() {
		return id;
	}

	public CodigoEstudiante getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public Nombre getNombre() {
		return nombre;
	}

	public Edad getEdad() {
		return edad;
	}

	public Grado getGrado() {
		return grado;
	}

	public NumCursos getNumCursos() {
		return numCursos;
	}
	
	public static Estudiante of(Id id, CodigoEstudiante codigoEstudiante, Nombre nombre, Edad edad, Grado grado,
			NumCursos numCursos) {
				return new Estudiante(id, codigoEstudiante, nombre, edad, grado, numCursos);
	}
	
}
