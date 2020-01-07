package com.example.estudiante.shared.dominio;

import com.example.estudiante.exceptions.ValueNotAllowedException;

public class Grado {
	
	private final int grado;
	
	public Grado (int grado) {
		if(grado < 1 || grado > 11) {
			throw new ValueNotAllowedException();
		}
		this.grado = grado;
	}
	
	public int getGrado() {
		return grado;
	}
}
