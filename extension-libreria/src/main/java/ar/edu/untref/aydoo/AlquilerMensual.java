package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class AlquilerMensual extends Alquiler{

	public AlquilerMensual(BigDecimal precio, Libro libro, Integer tiempoAlquiladoEnPeriodo) {	
		super(precio, libro, tiempoAlquiladoEnPeriodo);	
	}

	protected boolean valido(Integer tiempoAlquiladoEnPeriodo){

		boolean valido = false;

		if(1 <= tiempoAlquiladoEnPeriodo && tiempoAlquiladoEnPeriodo <= 3){
			valido = true;
		}

		return valido;

	}

}