package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class OrdenadorDeParametros {

	private String[] parametros;

	/**
	 * @Pre: - 
	 * @Post: Se Inicializa el OrdenadorDeParametros.
	 */
	public OrdenadorDeParametros(){

		this.parametros = new String[4];

		for(int i = 0 ; i < this.parametros.length ; i++){
			this.parametros[i] = " ";		
		}

	}

	/**
	 * @Pre: parametros es distinto de null, y el largo es mayor que 0 (Cero) (La entrada se supone valida).
	 * @Post: Devuelve un Array de Strings (Parametros) ordenados acorde a la convencion.
	 * 
	 * 		 Convencion:
	 * 		 1) NUMERO A FACTORIZAR.
	 * 		 2) FORMATO.
	 *       3) ORDENAMIENTO.
	 *       4) SALIDA POR ARCHIVO (OPCIONAL).
	 */
	public String[] ordenar(String[] parametros){

		List<String> listaDeParametros = this.pasarAUnaLista(parametros);
		this.parametros[0] = listaDeParametros.get(0);

		this.aniadirParametros(listaDeParametros);

		return this.parametros;

	}

	private List<String> pasarAUnaLista(String[] parametrosAPasar) {

		List<String> listaDeParametros = new ArrayList<String>();

		for(int i = 0 ; i < parametrosAPasar.length ; i++){	

			String palabraAPasar = parametrosAPasar[i].toLowerCase();
			listaDeParametros.add(palabraAPasar);

		}

		return listaDeParametros;

	}

	private void aniadirParametros(List<String> listaDeParametros){

		for(String parametroActual : listaDeParametros){

			//'--format=' tiene 9 letras. Se sospecha de que se pudo haber pedido un formato para la salida.
			if(parametroActual.length() >= 9){
			   this.aniadirFormato(parametroActual);
			}

			//'--sort:' tiene 7 letras. Se sospecha de que se pudo haber pedido un criterio de ordenamiento.
			if(parametroActual.length() >= 7){				
			   this.aniadirOrdenamiento(parametroActual);
			}

			//'--output-file=' tiene 14 letras. Se sospecha de que se pudo haber pedido un archivo como salida.
			if(parametroActual.length() >= 14){
			   this.aniadirNombreDelArchivoDeSalida(parametroActual);
			}

		}

	}

	private void aniadirFormato(String parametroActual){

		String parametro = parametroActual.substring(0,9);

		if("--format=".equals(parametro)){

			this.parametros[1] = parametroActual;

		}

	}

	private void aniadirOrdenamiento(String parametroActual){

		String parametro = parametroActual.substring(0,7);

		if("--sort:".equals(parametro)){

			this.parametros[2] = parametroActual;

		}

	}

	private void aniadirNombreDelArchivoDeSalida(String parametroActual){

		String parametro = parametroActual.substring(0,14);

		if("--output-file=".equals(parametro)){

			String nombreDelArchivoDeSalida = parametroActual.substring(14, parametroActual.length());
			this.parametros[3] = nombreDelArchivoDeSalida;

		}

	}

}