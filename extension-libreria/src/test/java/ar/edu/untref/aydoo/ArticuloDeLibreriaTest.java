package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ArticuloDeLibreriaTest {

	@Test
	public void elPrecioDevueltoDeUnArticuloDeLibreriaIncluyeIVA() {

		BigDecimal precioSinIVA = new BigDecimal("30.00");
		Producto cuaderno = new ArticuloDeLibreria("Cuaderno", precioSinIVA);
		BigDecimal precioConIVAEsperado = new BigDecimal("36.30");

		BigDecimal precioConIVAObtenido = cuaderno.getPrecio();

		Assert.assertEquals(precioConIVAEsperado, precioConIVAObtenido);

	}

}