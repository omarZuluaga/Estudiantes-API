package com.example.estudiante.infraestructura.mapper;

import org.springframework.stereotype.Component;

import com.example.estudiante.dominio.models.Estudiante;
import com.example.estudiante.infraestructura.dto.EstudianteDto;
import com.example.estudiante.infraestructura.rest.EstudianteRest;
import com.example.estudiante.shared.dominio.CodigoEstudiante;
import com.example.estudiante.shared.dominio.Edad;
import com.example.estudiante.shared.dominio.Grado;
import com.example.estudiante.shared.dominio.Id;
import com.example.estudiante.shared.dominio.Nombre;
import com.example.estudiante.shared.dominio.NumCursos;
import com.example.estudiante.shared.infrastructure.mapper.MapperDtoDominio;
import com.example.estudiante.shared.infrastructure.mapper.MapperRestDominio;

@Component
public class EstudianteMapper implements MapperDtoDominio<Estudiante, EstudianteDto>, MapperRestDominio<Estudiante, EstudianteRest>{
		
	@Override
	public Estudiante dtoToDominio(EstudianteDto o) {
		return Estudiante.of(new Id(o.getCodigo()), new CodigoEstudiante(o.getCodigoEstudiante()), new Nombre(o.getNombre()),
				new Edad(o.getEdad()), new Grado(o.getGrado()), new NumCursos(o.getNumCursos()));
	}

	@Override
	public Estudiante restToDominio(EstudianteRest b) {
		return Estudiante.of(new Id(b.getId()), new CodigoEstudiante(b.getCodigoEstudiante()), new Nombre(b.getNombre()), new Edad(b.getEdad()),
				new Grado(b.getGrado()), new NumCursos(b.getNumCursos()));
	}

	@Override
	public EstudianteRest dominioToRest(Estudiante a) {
		EstudianteRest er = new EstudianteRest();
		er.setId(a.getId().getValue());
		er.setCodigoEstudiante(a.getCodigoEstudiante().getCodigo());
		er.setNombre(a.getNombre().getNombre());
		er.setEdad(a.getEdad().getEdad());
		er.setGrado(a.getGrado().getGrado());
		er.setNumCursos(a.getNumCursos().getNumCursos());
		return er;
	}

	@Override
	public EstudianteDto dominioToDto(Estudiante i) {
		EstudianteDto ed = new EstudianteDto();
		ed.setCodigo(i.getId().getValue());
		ed.setNombre(i.getNombre().getNombre());
		ed.setEdad(i.getEdad().getEdad());
		ed.setCodigoEstudiante(i.getCodigoEstudiante().getCodigo());
		ed.setGrado(i.getGrado().getGrado());
		ed.setNumCursos(i.getNumCursos().getNumCursos());
		return ed;
	}
}
