package com.example.estudiante.exceptions;

public class NotFoundException extends RuntimeException{
	public NotFoundException() {
		super("No encontado");
	}
}
