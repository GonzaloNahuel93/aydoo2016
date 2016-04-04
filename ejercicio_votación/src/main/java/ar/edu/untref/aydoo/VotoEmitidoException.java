package ar.edu.untref.aydoo;

@SuppressWarnings("serial")
public class VotoEmitidoException extends RuntimeException{

	public VotoEmitidoException(){
		super("El voto ya fue emitido y no se puede cambiar.");
	}

}