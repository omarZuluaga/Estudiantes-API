package com.example.estudiante.infraestructura.dto;

import javax.persistence.Entity;

@Entity
public class EstudianteDto extends BaseEntity {
	private String nombre;
	private int edad;
	private int grado;
	private int numCursos;
	private int codigoEstudiante; 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	public int getNumCursos() {
		return numCursos;
	}
	public void setNumCursos(int numCursos) {
		this.numCursos = numCursos;
	}
	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}
	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}
	
}
