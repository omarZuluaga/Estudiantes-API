package com.example.estudiante.shared.dominio;

import com.example.estudiante.exceptions.ValueNotAllowedException;

public class CodigoEstudiante {
	
	private final int codigo;
	
	public CodigoEstudiante(int codigo) {
		if(codigo<=0) {
			throw new ValueNotAllowedException();
		}
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
}
