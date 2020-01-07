package com.example.estudiante.exceptions;

public class ValueNotAllowedException extends RuntimeException{
	public ValueNotAllowedException() {
		super("Valor no permitido");
	}

}
