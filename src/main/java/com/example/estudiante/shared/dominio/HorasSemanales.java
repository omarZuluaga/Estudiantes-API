package com.example.estudiante.shared.dominio;

import com.example.estudiante.exceptions.ValueNotAllowedException;

public class HorasSemanales {
	
	private final int horasSemanales;
	
	public HorasSemanales(int horasSemanales) {
		if(horasSemanales < 1 || horasSemanales > 4) {
			throw new ValueNotAllowedException();
		}
		this.horasSemanales = horasSemanales;
	}
	
	public int getHorasSemanales() {
		return horasSemanales;
	}
	
}
