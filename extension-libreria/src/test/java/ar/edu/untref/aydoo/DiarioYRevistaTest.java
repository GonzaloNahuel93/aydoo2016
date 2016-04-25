package ar.edu.untref.aydoo;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class DiarioYRevistaTest {

	@Test
	public void elPrecioDevueltoDeUnDiarioYRevistaNoIncluyeIVA() {

		BigDecimal precioSinIVA = new BigDecimal("15.00");
		Producto diarioPagina12 = new DiarioYRevista("Pagina 12", precioSinIVA, Periodicidad.DIARIA);

		BigDecimal precioSinIVAObtenido = diarioPagina12.getPrecio();

		Assert.assertEquals(precioSinIVA, precioSinIVAObtenido);

	}

}