package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class FactoresPrimos {

	/**
	 * @Pre: El numero ingresado no es primo, y es un entero mayor que 1 (Uno) (La entrada se supone valida en este caso).
	 * @Post: Se devuelve una lista con los factores primos del numero ingresado.
	 */
	public List<Integer> obtenerFactoresPrimos(int numero){

		List<Integer> factoresPrimos = new LinkedList<Integer>();

		int n = 2;

		while(numero >= 2){

			if(numero % n == 0){

				factoresPrimos.add(n);
				numero = numero / n;

			}else{

				n++;

			}

		}

		return factoresPrimos;

	}

}