package ar.edu.untref.aydoo;

@SuppressWarnings("serial")
public class DatoInvalidoException extends RuntimeException {

	public DatoInvalidoException(){
		super("Uno de los datos ingresados es invalido.");
	}

}