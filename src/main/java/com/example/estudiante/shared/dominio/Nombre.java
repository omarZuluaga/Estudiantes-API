package com.example.estudiante.shared.dominio;

import com.example.estudiante.exceptions.BadFormatException;

public class Nombre {
	
	private final String nombre;
	
	public Nombre(String nombre) {
		if(!nombre.matches("[A-Z].*")) {
			throw new BadFormatException();
		}
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
