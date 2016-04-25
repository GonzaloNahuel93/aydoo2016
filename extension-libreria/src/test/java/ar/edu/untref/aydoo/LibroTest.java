package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class LibroTest {

	@Test
	public void elPrecioDevueltoDeUnLibroNoIncluyeIVA() {

		BigDecimal precioSinIVA = new BigDecimal("100.00");
		Producto libroElTunel = new Libro("Escultismo para muchachos", precioSinIVA);

		BigDecimal precioSinIVAObtenido = libroElTunel.getPrecio();

		Assert.assertEquals(precioSinIVA, precioSinIVAObtenido);

	}

}