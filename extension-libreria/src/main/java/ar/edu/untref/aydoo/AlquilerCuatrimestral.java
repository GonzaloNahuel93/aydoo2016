package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class AlquilerCuatrimestral extends Alquiler{

	public AlquilerCuatrimestral(BigDecimal precio, Libro libro, Integer tiempoAlquiladoEnPeriodo){
		super(precio, libro, tiempoAlquiladoEnPeriodo);
	}

	public BigDecimal getPrecio(){

		BigDecimal tiempoAlquiladoEnPeriodo = new BigDecimal(super.getTiempoAlquiladoEnPeriodo());
		BigDecimal descuento = new BigDecimal("0.10").multiply(tiempoAlquiladoEnPeriodo);
		BigDecimal descuentoTotal = descuento.multiply(super.getPrecio());

		//Se saca el precio total con 2 decimales [setScale(2)]
		BigDecimal precioTotal = super.getPrecio().subtract(descuentoTotal).setScale(2);

		return precioTotal;

	}

	protected boolean valido(Integer tiempoAlquiladoEnPeriodo){

		boolean valido = false;

		if(tiempoAlquiladoEnPeriodo == 1 || tiempoAlquiladoEnPeriodo == 2){
			valido = true;
		}

		return valido;

	}

}