package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class DiarioYRevista extends Producto{

	private Periodicidad periodicidad;

	public DiarioYRevista(String descripcion, BigDecimal precio, Periodicidad periodicidad) {
		super(descripcion, precio);
		this.periodicidad = periodicidad;
	}

	public Periodicidad getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(Periodicidad periodicidad) {
		this.periodicidad = periodicidad;
	}

}