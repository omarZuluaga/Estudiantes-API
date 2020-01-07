package com.example.estudiante.shared.dominio;

import com.example.estudiante.exceptions.ExtendedCodeException;

public class Id {
	
	private final String value;
	
	public Id(String id) {
		if(id.length()>=64) {
			throw new ExtendedCodeException();
		}
		this.value = id;
	}

	public String getValue() {
		return value;
	}
}
