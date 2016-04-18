package ar.edu.untref.aydoo;

import java.util.List;

public class Formateador {

	private GeneradorDeSalida generadorDeSalida;

	/**
	 * @Pre: - 
	 * @Post: Inicializa el GeneradorDeSalida.
	 */
	public Formateador(){		
		this.generadorDeSalida = new GeneradorDeSalida();		
	}

	/**
	 * @Pre: listaParaMostrar es distinto de null (La entrada se supone valida), y no esta vacia.
	 * 		 formato es distinto de null, y es valido (PRETTY, QUIET, o no pide formato especifico).
	 * 		 salida es distinto de null, y es valida (Un archivo .txt, o no pide una salida especifica).
	 * @Post: Muestra la lista acorde al formato y la salida insertados.
	 */
	public void getSalida(List<Integer> listaParaMostrar, String formato, String salida){

		if("--format=pretty".equals(formato) || " ".equals(formato)){

			//El PRETTY al imprimir en horizontal, necesita colocar espacios
			String pretty = " ";
			this.generadorDeSalida.getSalida(listaParaMostrar, pretty, salida);

		}else if("--format=quiet".equals(formato)){

			//El QUIET al imprimir en vertical, necesita hacer saltos de linea
			String quiet = "\r\n";
			this.generadorDeSalida.getSalida(listaParaMostrar, quiet, salida);

		}else{

			System.out.println("Formato no aceptado. Las opciones posibles son : pretty o quiet.");

		}

	}

}