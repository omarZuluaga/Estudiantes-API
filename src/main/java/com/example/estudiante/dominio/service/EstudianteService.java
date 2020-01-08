package com.example.estudiante.dominio.service;

import java.util.List;

import com.example.estudiante.dominio.models.Estudiante;
import com.example.estudiante.shared.dominio.Id;

public interface EstudianteService {
	public List<Estudiante> buscarTodo();

	public Estudiante buscarPorId(Id codigo);

	public List<Estudiante> buscarPorIds(List<Id> codigos);

	public void guardar(Estudiante estudiante);

	public void eliminar(Id codigo);

	public void actualizar(Estudiante estudiante);
}
