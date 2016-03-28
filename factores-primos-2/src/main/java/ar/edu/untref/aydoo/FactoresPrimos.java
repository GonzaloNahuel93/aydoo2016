package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class FactoresPrimos {

	private List<Integer> factores;
	private int numeroAFactorizar;

	/**
	 * @Pre: El numero ingresado es un entero mayor que 1 (Uno) (La entrada se supone valida en este caso).
	 * @Post: Se inicializa la operacion acorde al numero ingresado.
	 * @return
	 */
	public FactoresPrimos(int numero){

		this.numeroAFactorizar = numero;
		this.factores = new LinkedList<Integer>();

	}

	/**
	 * @Pre: -
	 * @Post: Se devuelve al numero descompuesto en factores primos.
	 * @return
	 */
	public List<Integer> obtenerFactoresPrimos(){

		int n = 2;

		while(this.numeroAFactorizar >= 2){

			if(this.numeroAFactorizar % n == 0){

				this.factores.add(n);
				this.numeroAFactorizar = this.numeroAFactorizar / n;

			}else{

				n++;

			}

		}

		return (this.factores);

	}

}