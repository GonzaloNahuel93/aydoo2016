package ar.edu.untref.aydoo;

@SuppressWarnings("serial")
public class LibroAlquiladoException extends RuntimeException {

	public LibroAlquiladoException(){
		super("El Libro ya fue alquilado por otro cliente.");
	}

}