package ar.edu.untref.aydoo;

/**
 * @author Gonzalo Nahuel Di Pierro.
 * Ejercicio corregido 21/06/2016.
 *
 */
public class Program {

	/**
	* @Pre: El n�mero ingresado es un entero mayor que 1 (Uno) (La entrada se supone v�lida en este caso).
	* @Post: Se devuelve al n�mero descompuesto en factores primos.
	* @param numero
	*/
	public static final void main(String arg[]){

		int numero = Integer.parseInt(arg[0]);
		System.out.print("\nFactores primos del n�mero " + numero + ": ");

		//numeroActual: Es el n�mero que se tiene como referencia a medida que van ocurriendo las sucesivas divisiones para la descomposici�n del n�mero original
		//n: Es el n�mero por el que se debe empezar a probar la divisi�n sucesiva (En este caso el 2 (Dos)). Si el resto (%) no da 0 (Cero), se incrementa el n
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