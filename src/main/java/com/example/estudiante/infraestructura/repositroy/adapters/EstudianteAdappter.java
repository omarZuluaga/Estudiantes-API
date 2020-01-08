package com.example.estudiante.infraestructura.repositroy.adapters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.estudiante.dominio.models.Estudiante;
import com.example.estudiante.dominio.service.EstudianteService;
import com.example.estudiante.infraestructura.mapper.EstudianteMapper;
import com.example.estudiante.infraestructura.repositroy.database.EstudianteRepository;
import com.example.estudiante.shared.dominio.Id;

@Service
public class EstudianteAdappter implements EstudianteService {

	@Autowired
	public EstudianteRepository estudianteRepository;

	@Autowired
	public EstudianteMapper estudianteMapper;

	@Override
	public List<Estudiante> buscarTodo() {

		return estudianteMapper.listDtoToDominio(estudianteRepository.findAll());
	}

	@Override
	public Estudiante buscarPorId(Id codigo) {
		return estudianteMapper.dtoToDominio(estudianteRepository.findById(codigo.getValue()).get());
	}

	@Override
	public List<Estudiante> buscarPorIds(List<Id> codigos) {
		return estudianteMapper.listDtoToDominio(estudianteRepository
				.findAllById(codigos.stream().map(codigo -> codigo.getValue()).collect(Collectors.toList())));
	}

	@Override
	public void guardar(Estudiante estudiante) {
		estudianteRepository.save(estudianteMapper.dominioToDto(estudiante));
	}

	@Override
	public void eliminar(Id codigo) {
		estudianteRepository.deleteById(codigo.getValue());

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		estudianteRepository.save(estudianteMapper.dominioToDto(estudiante));

	}

}
