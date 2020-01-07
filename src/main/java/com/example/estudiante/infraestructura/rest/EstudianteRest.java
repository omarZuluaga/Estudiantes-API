package com.example.estudiante.infraestructura.rest;

public class EstudianteRest {
	private String id;
	private int codigoEstudiante;
	private String nombre;
	private int edad;
	private int grado;
	private int numCursos;
	
	public EstudianteRest() {
		
	}

	public EstudianteRest(String id, int codigoEstudiante, String nombre, int edad, int grado, int numCursos) {
		this.setId(id);
		this.setCodigoEstudiante(codigoEstudiante);
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setGrado(grado);
		this.setNumCursos(numCursos);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCodigoEstudiante() {
		return codigoEstudiante;
	}

	public void setCodigoEstudiante(int codigoEstudiante) {
		this.codigoEstudiante = codigoEstudiante;
	}

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
	
	
}
