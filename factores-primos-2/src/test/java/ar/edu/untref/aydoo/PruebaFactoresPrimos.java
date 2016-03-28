package ar.edu.untref.aydoo;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PruebaFactoresPrimos {

	@Test
	public void factorizarElNumero20(){

		FactoresPrimos numero20 = new FactoresPrimos(20);
		List<Integer> factores = numero20.obtenerFactoresPrimos();

		Assert.assertEquals("Cantidad de Factores Primos", 3, factores.size());
		Assert.assertEquals("Primero: 2", 2, (int)factores.get(0));
		Assert.assertEquals("Segundo: 2", 2, (int)factores.get(1));
		Assert.assertEquals("Tercero: 5", 5, (int)factores.get(2));

	}

	@Test
	public void factorizarElNumero90(){

		FactoresPrimos numero90 = new FactoresPrimos(90);
		List<Integer> factores = numero90.obtenerFactoresPrimos();

		Assert.assertEquals("Cantidad de Factores Primos", 4, factores.size());
		Assert.assertEquals("Primero: 2", 2, (int)factores.get(0));
		Assert.assertEquals("Segundo: 3", 3, (int)factores.get(1));
		Assert.assertEquals("Tercero: 3", 3, (int)factores.get(2));
		Assert.assertEquals("Cuarto: 5", 5, (int)factores.get(3));

	}

	@Test
	public void factorizarElNumero360(){

		FactoresPrimos numero360 = new FactoresPrimos(360);
		List<Integer> factores = numero360.obtenerFactoresPrimos();

		Assert.assertEquals("Cantidad de Factores Primos", 6, factores.size());
		Assert.assertEquals("Primero: 2", 2, (int)factores.get(0));
		Assert.assertEquals("Segundo: 2", 2, (int)factores.get(1));
		Assert.assertEquals("Tercero: 2", 2, (int)factores.get(2));
		Assert.assertEquals("Cuarto: 3", 3, (int)factores.get(3));
		Assert.assertEquals("Quinto: 3", 3, (int)factores.get(4));
		Assert.assertEquals("Sexto: 5", 5, (int)factores.get(5));

	}

	@Test
	public void factorizarElNumero1000(){

		FactoresPrimos numero1000 = new FactoresPrimos(1000);
		List<Integer> factores = numero1000.obtenerFactoresPrimos();

		Assert.assertEquals("Cantidad de Factores Primos", 6, factores.size());
		Assert.assertEquals("Primero: 2", 2, (int)factores.get(0));
		Assert.assertEquals("Segundo: 2", 2, (int)factores.get(1));
		Assert.assertEquals("Tercero: 2", 2, (int)factores.get(2));
		Assert.assertEquals("Cuarto: 5", 5, (int)factores.get(3));
		Assert.assertEquals("Quinto: 5", 5, (int)factores.get(4));
		Assert.assertEquals("Sexto: 5", 5, (int)factores.get(5));

	}

	@Test
	public void factorizarElNumero2000(){

		FactoresPrimos numero2000 = new FactoresPrimos(2000);
		List<Integer> factores = numero2000.obtenerFactoresPrimos();

		Assert.assertEquals("Cantidad de Factores Primos", 7, factores.size());
		Assert.assertEquals("Primero: 2", 2, (int)factores.get(0));
		Assert.assertEquals("Segundo: 2", 2, (int)factores.get(1));
		Assert.assertEquals("Tercero: 2", 2, (int)factores.get(2));
		Assert.assertEquals("Cuarto: 2", 2, (int)factores.get(3));
		Assert.assertEquals("Quinto: 5", 5, (int)factores.get(4));
		Assert.assertEquals("Sexto: 5", 5, (int)factores.get(5));
		Assert.assertEquals("Septimo: 5", 5, (int)factores.get(6));

	}

}