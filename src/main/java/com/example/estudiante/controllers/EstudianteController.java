package com.example.estudiante.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.estudiante.aplication.EstudianteAplication;
import com.example.estudiante.dominio.service.EstudianteService;
import com.example.estudiante.infraestructura.mapper.EstudianteMapper;
import com.example.estudiante.infraestructura.rest.EstudianteRest;

@RequestMapping("/estudiante")
@RestController
public class EstudianteController {
	
	private EstudianteAplication estudianteAplication;
	
	public EstudianteController(@Autowired EstudianteService estudianteService, @Autowired EstudianteMapper estudianteMapper) {
		this.estudianteAplication = new EstudianteAplication(estudianteService, estudianteMapper);
	}
	
	@PostMapping
	public void agregarEstudiante(@RequestBody EstudianteRest estudianteRest) {
		estudianteAplication.guardarEstudiante(estudianteRest);
	}
	
	@GetMapping
	public List<EstudianteRest> mostrarEstudiantes(){
		return estudianteAplication.buscarEstudiantes();
	}
	
	@GetMapping("/{id}")
	public EstudianteRest mostrarEstudianteXId(@PathVariable String id) {
		return estudianteAplication.buscarEstudiantePorId(id);
	}
	
	@PutMapping
	public void actualizarEstudiante(@RequestBody EstudianteRest estudianteRest) {
		estudianteAplication.actualizarEstudiante(estudianteRest);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarEstudiante(@PathVariable String id) {
		estudianteAplication.eliminarEstudiante(id);
	}
}
