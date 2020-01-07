package com.example.estudiante.exceptions;

public class BadFormatException extends RuntimeException{
	public BadFormatException() {
		super("Formato no permitido, solo mayusculas");
	}
}
