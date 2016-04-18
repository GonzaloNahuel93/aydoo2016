package ar.edu.untref.aydoo;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class OrdenadorDeFactoresPrimosTest {

	@Test
	public void sePideDevolverUnaListaConCriterioDeOrdenDescendente(){

		FactoresPrimos factorizacion = new FactoresPrimos();
		List<Integer> factoresPrimos = factorizacion.obtenerFactoresPrimos(360);

		OrdenadorDeFactoresPrimos ordenador = new OrdenadorDeFactoresPrimos();
		List<Integer> numeros = ordenador.ordenar(factoresPrimos, "--sort:des");

		Assert.assertEquals(5, ((int)numeros.get(0)));
		Assert.assertEquals(3, ((int)numeros.get(1)));
		Assert.assertEquals(3, ((int)numeros.get(2)));
		Assert.assertEquals(2, ((int)numeros.get(3)));
		Assert.assertEquals(2, ((int)numeros.get(4)));
		Assert.assertEquals(2, ((int)numeros.get(5)));

	}

	@Test
	public void sePideDevolverUnaListaConCriterioDeOrdenAscendente(){

		FactoresPrimos factorizacion = new FactoresPrimos();
		List<Integer> factoresPrimos = factorizacion.obtenerFactoresPrimos(360);

		OrdenadorDeFactoresPrimos ordenador = new OrdenadorDeFactoresPrimos();
		List<Integer> numeros = ordenador.ordenar(factoresPrimos, "--sort:asc");

		Assert.assertEquals(2, ((int)numeros.get(0)));
		Assert.assertEquals(2, ((int)numeros.get(1)));
		Assert.assertEquals(2, ((int)numeros.get(2)));
		Assert.assertEquals(3, ((int)numeros.get(3)));
		Assert.assertEquals(3, ((int)numeros.get(4)));
		Assert.assertEquals(5, ((int)numeros.get(5)));

	}

	@Test
	public void sePideDevolverUnaListaConCriterioDeOrdenPorDefaultSiendoEsteAscendente(){

		FactoresPrimos factorizacion = new FactoresPrimos();
		List<Integer> factoresPrimos = factorizacion.obtenerFactoresPrimos(360);

		OrdenadorDeFactoresPrimos ordenador = new OrdenadorDeFactoresPrimos();
		List<Integer> numeros = ordenador.ordenar(factoresPrimos, " ");

		Assert.assertEquals(2, ((int)numeros.get(0)));
		Assert.assertEquals(2, ((int)numeros.get(1)));
		Assert.assertEquals(2, ((int)numeros.get(2)));
		Assert.assertEquals(3, ((int)numeros.get(3)));
		Assert.assertEquals(3, ((int)numeros.get(4)));
		Assert.assertEquals(5, ((int)numeros.get(5)));

	}

}