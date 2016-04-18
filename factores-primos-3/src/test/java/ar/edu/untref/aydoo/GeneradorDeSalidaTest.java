package ar.edu.untref.aydoo;

import java.util.List;
import org.junit.Test;

public class GeneradorDeSalidaTest {

	@Test
	public void seImprimePorConsolaUnaListaDeFactoresPrimosEnFormatoPretty(){

		FactoresPrimos factorizacion = new FactoresPrimos();
		List<Integer> factoresPrimosDe1000 = factorizacion.obtenerFactoresPrimos(1000);

		GeneradorDeSalida generadorDeSalida = new GeneradorDeSalida();
		String pretty = " ";
		generadorDeSalida.getSalida(factoresPrimosDe1000, pretty, " ");

	}

	@Test
	public void seImprimePorConsolaUnaListaDeFactoresPrimosEnFormatoQuiet(){

		FactoresPrimos factorizacion = new FactoresPrimos();
		List<Integer> factoresPrimosDe1000 = factorizacion.obtenerFactoresPrimos(1000);

		GeneradorDeSalida generadorDeSalida = new GeneradorDeSalida();
		String quiet = "\r\n";
		generadorDeSalida.getSalida(factoresPrimosDe1000, quiet, " ");

	}

	@Test
	public void seGeneraUnArchivoQueMuestraUnaListaDeFactoresPrimosEnFormatoPretty(){

		FactoresPrimos factorizacion = new FactoresPrimos();
		List<Integer> factoresPrimosDe1000 = factorizacion.obtenerFactoresPrimos(1000);

		GeneradorDeSalida generadorDeSalida = new GeneradorDeSalida();
		String pretty = " ";
		generadorDeSalida.getSalida(factoresPrimosDe1000, pretty, "Factores Primos en Pretty.txt");

	}

	@Test
	public void seGeneraUnArchivoQueMuestraUnaListaDeFactoresPrimosEnFormatoQuiet(){

		FactoresPrimos factorizacion = new FactoresPrimos();
		List<Integer> factoresPrimosDe1000 = factorizacion.obtenerFactoresPrimos(1000);

		GeneradorDeSalida generadorDeSalida = new GeneradorDeSalida();
		String quiet = "\r\n";
		generadorDeSalida.getSalida(factoresPrimosDe1000, quiet, "Factores Primos en Quiet.txt");

	}

	@Test
	public void seIntentaGenerarUnArchivoDeFormatoInvalidoQueMuestreUnaListaDeFactoresPrimosEnFormatoPretty(){

		FactoresPrimos factorizacion = new FactoresPrimos();
		List<Integer> factoresPrimosDe1000 = factorizacion.obtenerFactoresPrimos(1000);

		GeneradorDeSalida generadorDeSalida = new GeneradorDeSalida();
		String pretty = " ";
		generadorDeSalida.getSalida(factoresPrimosDe1000, pretty, "Factores Primos en Pretty.doc");

	}

	@Test
	public void seIntentaGenerarUnArchivoDeFormatoInvalidoQueMuestreUnaListaDeFactoresPrimosEnFormatoQuiet(){

		FactoresPrimos factorizacion = new FactoresPrimos();
		List<Integer> factoresPrimosDe1000 = factorizacion.obtenerFactoresPrimos(1000);

		GeneradorDeSalida generadorDeSalida = new GeneradorDeSalida();
		String quiet = "\r\n";
		generadorDeSalida.getSalida(factoresPrimosDe1000, quiet, "Factores Primos en Quiet.doc");

	}

}