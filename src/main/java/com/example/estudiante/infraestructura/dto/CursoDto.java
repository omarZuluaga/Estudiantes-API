package com.example.estudiante.infraestructura.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.example.estudiante.infraestructura.dto.EstudianteDto;

@Entity
public class CursoDto extends BaseEntity{
	private int codigoCurso;
	private String nombreCurso; 
	private int horasSemanales; 
	@OneToMany (cascade = CascadeType.ALL, targetEntity = EstudianteDto.class)
	private List<EstudianteDto> estudiantes;
	
	public List<EstudianteDto> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<EstudianteDto> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}
	
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	public String getNombreCurso() {
		return nombreCurso;
	}
	
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
	public int getHorasSemanales() {
		return horasSemanales;
	}
	
	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	} 
}
