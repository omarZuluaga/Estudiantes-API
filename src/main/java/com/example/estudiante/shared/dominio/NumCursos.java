package com.example.estudiante.shared.dominio;

import com.example.estudiante.exceptions.ValueNotAllowedException;

public class NumCursos {
	
	private final int numCursos;
	
	public NumCursos(int numCursos) {
		if(numCursos < 1 || numCursos > 10) {
			throw new ValueNotAllowedException();
		}
		this.numCursos = numCursos;
	}
	
	public int getNumCursos() {
		return numCursos;
	}
}
