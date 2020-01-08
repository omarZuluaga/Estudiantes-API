package com.example.estudiante.dominio.service;

import java.util.List;

import com.example.estudiante.dominio.models.Curso;
import com.example.estudiante.shared.dominio.Id;

public interface CursoService {
	public List<Curso> buscarTodo();
	public Curso buscarPorId(Id codigo);
	public List<Curso> buscarPorIds(List<Id> codigos);
	public void guardarCurso(Curso curso);
	public void actualizarCurso(Curso curso);
	public void eliminarCurso(Id codigo);
}
