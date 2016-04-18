package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class GeneradorDeSalida{

	/**
	 * @Pre: listaParaMostrar es distinto de null, y no esta vacia.
	 * 		 formato es distinto de null, y es valido (PRETTY, QUIET, o no pide formato especifico).
	 * 		 salida es distinto de null, y es valida (Un archivo .txt, o no pide una salida especifica).
	 * @Post: Muestra la lista acorde al formato y la salida insertados.
	 */
	public void getSalida(List<Integer> listaParaMostrar, String formato, String salida){

		if(salida.length() > 4){

			this.peticionDeArchivo(listaParaMostrar, formato, salida);

		}else if(" ".equals(salida)){

			this.imprimirPorConsola(listaParaMostrar, formato);

		}else{

			System.out.println("La salida especificada es invalida.");

		}

	}

	private void peticionDeArchivo(List<Integer> listaParaMostrar, String formato, String salida){

		String formatoDeArchivo = salida.substring(salida.length() - 4, salida.length());

		if(".txt".equals(formatoDeArchivo)){

			String nombreDelArchivo = salida;
			this.generarArchivo(nombreDelArchivo, listaParaMostrar, formato);

		}else{

			System.out.println("Formato de archivo no aceptado. Solamente se pueden generar archivos .txt .");

		}

	}

	private void generarArchivo(String nombre, List<Integer> listaAImprimir, String formato){

		File file = new File(nombre);

		try{

			FileWriter fw = new FileWriter(file);
			BufferedWriter archivo = new BufferedWriter(fw);

			for(Integer numero : listaAImprimir){
				archivo.write(numero + formato);				
			}

			archivo.close();

		}catch(Exception e){

			System.out.println("Ocurrio un Error al escribir en el archivo.");

		}

	}

	private void imprimirPorConsola(List<Integer> listaAImprimir, String formato){

		for(int i = 0 ; i < listaAImprimir.size() ; i++){

			System.out.print(listaAImprimir.get(i) + formato);

		}

	}

}