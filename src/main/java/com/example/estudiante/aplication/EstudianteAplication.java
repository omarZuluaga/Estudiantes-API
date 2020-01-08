package com.example.estudiante.aplication;

import java.util.List;
import java.util.UUID;

import com.example.estudiante.dominio.service.EstudianteService;
import com.example.estudiante.infraestructura.mapper.EstudianteMapper;
import com.example.estudiante.infraestructura.rest.EstudianteRest;
import com.example.estudiante.shared.dominio.Id;

public class EstudianteAplication {
	
	private EstudianteService estudianteService;
	private EstudianteMapper estudianteMapper;
	
	public EstudianteAplication(EstudianteService estudianteService, EstudianteMapper estudianteMapper) {
		this.estudianteService = estudianteService;
		this.estudianteMapper = estudianteMapper;
	}
	
	public void guardarEstudiante(EstudianteRest er) {
		er.setId(UUID.randomUUID().toString());
		estudianteService.guardar(estudianteMapper.restToDominio(er));
	}
	
	public List<EstudianteRest> buscarEstudiantes(){
		return estudianteMapper.listDominioToListRest(estudianteService.buscarTodo());
	}
	
	public EstudianteRest buscarEstudiantePorId(String codigo) {
		return estudianteMapper.dominioToRest(estudianteService.buscarPorId(new Id(codigo)));
	}
	
	public List<EstudianteRest> buscarEstudiantesPorIds(List<Id> codigos){
		return estudianteMapper.listDominioToListRest(estudianteService.buscarPorIds(codigos));
	}
	
	public void actualizarEstudiante(EstudianteRest er) {
		estudianteMapper.dominioToRest(estudianteService.buscarPorId(new Id(er.getId())));
		estudianteService.guardar(estudianteMapper.restToDominio(er));
	}
	
	public void eliminarEstudiante(String codigo) {
		estudianteService.eliminar(new Id(codigo));
	}
}
