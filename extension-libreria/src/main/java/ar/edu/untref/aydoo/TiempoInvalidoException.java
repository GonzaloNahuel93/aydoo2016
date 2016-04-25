package ar.edu.untref.aydoo;

@SuppressWarnings("serial")
public class TiempoInvalidoException extends RuntimeException{

	public TiempoInvalidoException(){
		super("El tiempo que se desea alquilar dentro del periodo del alquiler es invalido.");
	}

}