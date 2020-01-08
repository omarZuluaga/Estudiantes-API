package com.example.estudiante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.estudiante.aplication.CursoAplication;
import com.example.estudiante.dominio.service.CursoService;
import com.example.estudiante.infraestructura.mapper.CursoMapper;
import com.example.estudiante.infraestructura.rest.CursoRest;

@RequestMapping("/curso")
@RestController
public class CursoController {
	
	private CursoAplication cursoAplication;
	
	public CursoController(@Autowired CursoService cursoService, @Autowired CursoMapper cursoMapper) {
		this.cursoAplication = new CursoAplication(cursoService, cursoMapper);
	}
	
	@PostMapping
	public void guardarCurso(@RequestBody CursoRest cr) {
		cursoAplication.guardarCurso(cr);
	}
	
	@GetMapping
	public List<CursoRest> buscarCursos(){
		return cursoAplication.buscarEstudiantes();
	}
	
	@GetMapping("/{id}")
	public CursoRest buscarCursoXId(String id) {
		return cursoAplication.buscarEstudiantesXId(id);
	}
	
	@PutMapping
	public void actualizarCurso(@RequestBody CursoRest cr) {
		cursoAplication.actualizarCurso(cr);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCurso(String id) {
		cursoAplication.eliminarCurso(id);
	}
}
