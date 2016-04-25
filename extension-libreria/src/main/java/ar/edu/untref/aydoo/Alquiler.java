package ar.edu.untref.aydoo;

import java.math.BigDecimal;

public abstract class Alquiler extends Producto{

	private Libro libro;
	private Integer tiempoAlquiladoEnPeriodo;

	public Alquiler(BigDecimal precio, Libro libro, Integer tiempoAlquiladoEnPeriodo){

		super("Alquiler", precio);

		validarSiElLibroYaFueAlquilado(libro);
		validarTiempoAlquiladoEnPeriodo(tiempoAlquiladoEnPeriodo);

	}

	public Libro getLibro(){
		return this.libro;
	}

	public Integer getTiempoAlquiladoEnPeriodo(){
		return this.tiempoAlquiladoEnPeriodo;
	}

	public BigDecimal getPrecio(){

		BigDecimal tiempoAlquiladoEnPeriodo = new BigDecimal(this.getTiempoAlquiladoEnPeriodo());
		BigDecimal precioTotal = super.getPrecio().multiply(tiempoAlquiladoEnPeriodo);

		return precioTotal;

	}

	private void validarSiElLibroYaFueAlquilado(Libro libro){

		if(!libro.alquilado()){

			libro.alquilar();
			this.libro = libro;

		}else{

			throw new LibroAlquiladoException();

		}

	}

	private void validarTiempoAlquiladoEnPeriodo(Integer tiempoAlquiladoEnPeriodo){

		if(this.valido(tiempoAlquiladoEnPeriodo)){

			this.tiempoAlquiladoEnPeriodo = tiempoAlquiladoEnPeriodo;

		}else{

			throw new TiempoInvalidoException();

		}

	}

	protected abstract boolean valido(Integer tiempoAlquiladoEnPeriodo);

}