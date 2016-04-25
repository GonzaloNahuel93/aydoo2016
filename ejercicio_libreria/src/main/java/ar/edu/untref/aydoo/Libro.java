package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public class Libro extends Producto{

	private boolean alquilado;

	public Libro(String descripcion, BigDecimal precio){
		super(descripcion, precio);
		this.alquilado = false;
	}

	public void alquilar(){
		this.alquilado = true;
	}

	public boolean alquilado(){
		return this.alquilado;
	}

}