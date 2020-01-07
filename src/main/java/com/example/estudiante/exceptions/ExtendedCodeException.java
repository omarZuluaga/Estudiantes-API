package com.example.estudiante.exceptions;

public class ExtendedCodeException extends RuntimeException{
	public ExtendedCodeException() {
		super("Codigo excede longitud de 64 bits o es menor de 32 bits");
	}
}
