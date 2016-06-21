package ar.edu.untref.aydoo;

/**
 * @author Gonzalo Nahuel Di Pierro.
 * Ejercicio corregido 21/06/2016.
 *
 */
public class Program {

	/**
	* @Pre: El número ingresado es un entero mayor que 1 (Uno) (La entrada se supone válida en este caso).
	* @Post: Se devuelve al número descompuesto en factores primos.
	* @param numero
	*/
	public static final void main(String arg[]){

		int numero = Integer.parseInt(arg[0]);
		System.out.print("\nFactores primos del número " + numero + ": ");

		//numeroActual: Es el número que se tiene como referencia a medida que van ocurriendo las sucesivas divisiones para la descomposición del número original
		//n: Es el número por el que se debe empezar a probar la división sucesiva (En este caso el 2 (Dos)). Si el resto (%) no da 0 (Cero), se incrementa el n
		int numeroActual = numero;
		int n = 2;

		while(numeroActual >= 2){

			if(numeroActual % n == 0){

				numeroActual = numeroActual / n;
				System.out.print(n + " ");

			}else{

				n++;

			}

		}   

	}

}