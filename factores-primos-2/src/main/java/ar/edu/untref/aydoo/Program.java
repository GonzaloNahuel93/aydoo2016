package ar.edu.untref.aydoo;

import java.util.List;

public class Program {

	public static final void main(String arg[]){

		//Datos ingresados
		int numero = Integer.parseInt(arg[0]);
		String formato = arg[1].toLowerCase();

		//Obtengo Factores Primos
		FactoresPrimos factorizar = new FactoresPrimos(numero);
		List<Integer> factoresPrimos = factorizar.obtenerFactoresPrimos();

		if(formato.equals("--format=pretty")){

			System.out.print("Factores primos " + numero + ": ");

			for(int i = 0 ; i < factoresPrimos.size() ; i++){

				System.out.print((int)factoresPrimos.get(i));

			}

		}else if(formato.equals("--format=quiet")){

			for(int i = 0 ; i < factoresPrimos.size() ; i++){

				System.out.println((int)factoresPrimos.get(i));

			}

		}else{

			System.out.println("Formato no aceptado. Las opciones posibles son : pretty o quiet.");

		}

	}

}