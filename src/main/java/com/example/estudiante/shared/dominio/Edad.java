package com.example.estudiante.shared.dominio;

import com.example.estudiante.exceptions.ValueNotAllowedException;

public class Edad {
	private final int edad;
	public Edad(int edad) {
		if(edad > 110 || edad <= 0) {
			throw new ValueNotAllowedException();
		}
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
}
