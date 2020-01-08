package com.example.estudiante.infraestructura.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.estudiante.dominio.models.Curso;
import com.example.estudiante.infraestructura.dto.CursoDto;
import com.example.estudiante.infraestructura.rest.CursoRest;
import com.example.estudiante.shared.dominio.CodigoCursos;
import com.example.estudiante.shared.dominio.HorasSemanales;
import com.example.estudiante.shared.dominio.Id;
import com.example.estudiante.shared.dominio.Nombre;
import com.example.estudiante.shared.infrastructure.mapper.MapperDtoDominio;
import com.example.estudiante.shared.infrastructure.mapper.MapperRestDominio;

@Component
public class CursoMapper implements MapperDtoDominio<Curso, CursoDto>, MapperRestDominio<Curso, CursoRest>{
	
	@Autowired
	EstudianteMapper estudianteMapper;

	@Override
	public Curso restToDominio(CursoRest b) {
		return Curso.of(new Id(b.getId()), new CodigoCursos(b.getCodigoCurso()), new Nombre(b.getNombre()),
				new HorasSemanales(b.getHorasSemanales()), estudianteMapper.listRestToListDominio(b.getEstudiantes()));
	}

	@Override
	public CursoRest dominioToRest(Curso a) {
		CursoRest cr = new CursoRest();
		cr.setId(a.getId().getValue());
		cr.setCodigoCurso(a.getCodigoCursos().getCodigoCursos());
		cr.setNombre(a.getNombreCurso().getNombre());
		cr.setHorasSemanales(a.getHorasSemanales().getHorasSemanales());
		cr.setEstudiantes(estudianteMapper.listDominioToListRest(a.getEstudiantes()));
		return cr;
	}

	@Override
	public Curso dtoToDominio(CursoDto o) {
		return Curso.of(new Id(o.getCodigo()), new CodigoCursos(o.getCodigoCurso()), new Nombre(o.getNombreCurso()) ,
				new HorasSemanales(o.getHorasSemanales()), estudianteMapper.listDtoToDominio(o.getEstudiantes()));
	}

	@Override
	public CursoDto dominioToDto(Curso i) {
		CursoDto cd = new CursoDto();
		cd.setCodigo(i.getId().getValue());
		cd.setCodigoCurso(i.getCodigoCursos().getCodigoCursos());
		cd.setNombreCurso(i.getNombreCurso().getNombre());
		cd.setHorasSemanales(i.getHorasSemanales().getHorasSemanales());
		cd.setEstudiantes(estudianteMapper.listDominioToDto(i.getEstudiantes()));
		return cd;
	}
	
}
