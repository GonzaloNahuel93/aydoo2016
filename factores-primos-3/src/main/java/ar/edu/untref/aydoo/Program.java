package ar.edu.untref.aydoo;

public class Program {

	/**
	 * @author Gonzalo Nahuel Di Pierro - Analisis y Diseño Orientado a Objetos 2016
	 * 
	 * Convencion:
	 * - Si no se especifica tipo de formato ==> Se asume que es PRETTY.
	 * - Si no se especifica tipo de ordenamiento ==> Se asume que es ASCENDENTE.
	 * - Si no se especifica la salida de un archivo ==> Se imprime por CONSOLA.
	 */
	public static final void main(String arg[]){

		AdministradorDePrograma administrador = new AdministradorDePrograma();
		administrador.realizarTarea(arg);

	}

}