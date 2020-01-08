 
package com.example.estudiante.aplication;

import java.util.List;
import java.util.UUID;

import com.example.estudiante.dominio.service.CursoService;
import com.example.estudiante.infraestructura.mapper.CursoMapper;
import com.example.estudiante.infraestructura.rest.CursoRest;
import com.example.estudiante.shared.dominio.Id;

public class CursoAplication {
	private CursoService cursoService;
	private CursoMapper cursoMapper;
	
	public CursoAplication(CursoService cursoService, CursoMapper cursoMapper) {
	
		this.cursoService = cursoService;
		this.cursoMapper = cursoMapper;
	}
	
	public void guardarCurso(CursoRest cr) {
		cr.setId(UUID.randomUUID().toString());
		cursoService.guardarCurso(cursoMapper.restToDominio(cr));
	}
	
	public List<CursoRest> buscarEstudiantes(){
		return cursoMapper.listDominioToListRest(cursoService.buscarTodo());
	}
	
	public CursoRest buscarEstudiantesXId(String id) {
		return cursoMapper.dominioToRest(cursoService.buscarPorId(new Id(id)));
	}
	
	public void actualizarCurso(CursoRest cr) {
		cursoService.actualizarCurso(cursoMapper.restToDominio(cr));
	}
	
	public void eliminarCurso(String id) {
		cursoService.eliminarCurso(new Id(id));
	}
}
