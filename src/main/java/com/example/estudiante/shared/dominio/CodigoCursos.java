package com.example.estudiante.shared.dominio;

import com.example.estudiante.exceptions.ValueNotAllowedException;

public class CodigoCursos {
	
	private final int codigoCursos;
	
	public CodigoCursos(int codigoCursos) {
		if(codigoCursos < 1) {
			throw new ValueNotAllowedException();
		}
		this.codigoCursos = codigoCursos;
	}
	
	public int getCodigoCursos() {
		return codigoCursos;
	}
	
}
