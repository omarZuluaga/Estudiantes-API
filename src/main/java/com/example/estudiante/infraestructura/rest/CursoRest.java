package com.example.estudiante.infraestructura.rest;

import java.util.List;

public class CursoRest {
	private String id;
	private int codigoCurso;
	private String nombre;
	private int horasSemanales;
	private List<EstudianteRest> estudiantes;
	
	public CursoRest() {
		
	}

	public CursoRest(String id, int codigoCurso, String nombre, int horasSemanales, List<EstudianteRest> estudiantes) {
		super();
		this.setId(id);
		this.setCodigoCurso(codigoCurso);
		this.setNombre(nombre);
		this.setHorasSemanales(horasSemanales);
		this.setEstudiantes(estudiantes);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}

	public List<EstudianteRest> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<EstudianteRest> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
