package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class AlquilerDiario extends Alquiler{

	public AlquilerDiario(BigDecimal precio, Libro libro, Integer tiempoAlquiladoEnPeriodo){
		super(precio, libro, tiempoAlquiladoEnPeriodo);
	}

	protected boolean valido(Integer tiempoAlquiladoEnPeriodo){

		boolean valido = false;

		if(3 <= tiempoAlquiladoEnPeriodo && tiempoAlquiladoEnPeriodo <= 25){
			valido = true;
		}

		return valido;

	}

}