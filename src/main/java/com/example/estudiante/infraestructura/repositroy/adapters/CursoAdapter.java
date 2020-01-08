package com.example.estudiante.infraestructura.repositroy.adapters;

import java.util.List;


import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estudiante.dominio.models.Curso;
import com.example.estudiante.dominio.service.CursoService;
import com.example.estudiante.infraestructura.mapper.CursoMapper;
import com.example.estudiante.infraestructura.repositroy.database.CursoRepository;
import com.example.estudiante.shared.dominio.Id;


@Service
public class CursoAdapter implements CursoService{
	
	@Autowired
	public CursoRepository cursoRepository;
	
	@Autowired
	public CursoMapper cursoMapper;

	@Override
	public List<Curso> buscarTodo() {
		return cursoMapper.listDtoToDominio(cursoRepository.findAll());
	}

	@Override
	public Curso buscarPorId(Id codigo) {
		return cursoMapper.dtoToDominio(cursoRepository.findById(codigo.getValue()).get());
	}

	@Override
	public List<Curso> buscarPorIds(List<Id> codigos) {
		return cursoMapper.listDtoToDominio(cursoRepository.findAllById(
				codigos.stream()
				.map(codigo -> codigo.getValue())
				.collect(Collectors.toList())));
	}

	@Override
	public void guardarCurso(Curso curso) {
		cursoRepository.save(cursoMapper.dominioToDto(curso));
		
	}

	@Override
	public void actualizarCurso(Curso curso) {
		cursoRepository.save(cursoMapper.dominioToDto(curso));
	}

	@Override
	public void eliminarCurso(Id codigo) {
		cursoRepository.deleteById(codigo.getValue());
	}

}
