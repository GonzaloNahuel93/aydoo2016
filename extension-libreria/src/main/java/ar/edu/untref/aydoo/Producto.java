package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public abstract class Producto {

	private String descripcion;
	private BigDecimal precio;

	public Producto(String descripcion, BigDecimal precio){
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	} 

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}