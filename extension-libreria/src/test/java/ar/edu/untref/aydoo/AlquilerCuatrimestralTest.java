package ar.edu.untref.aydoo;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class AlquilerCuatrimestralTest {

	@Test
	public void seQuiereAlquilarUnLibroPor1Cuatrimestre(){

		Producto fisicaI = new Libro("Fisica I", new java.math.BigDecimal("100.00"));
		Alquiler alquilerCuatrimestral = new AlquilerCuatrimestral(new java.math.BigDecimal("800.00"), (Libro)fisicaI, 1);

		BigDecimal precioEsperado = new BigDecimal("720.00");
		BigDecimal precioObtenido = alquilerCuatrimestral.getPrecio();

		Assert.assertEquals(precioEsperado, precioObtenido);

	}

	@Test(expected = TiempoInvalidoException.class)
	public void seQuiereAlquilarUnLibroPor0Cuatrimestres(){

		Producto fisicaII = new Libro("Fisica II", new java.math.BigDecimal("100.00"));
		Alquiler alquilerCuatrimestral = new AlquilerCuatrimestral(new java.math.BigDecimal("800.00"), (Libro)fisicaII, 0);

		alquilerCuatrimestral.getPrecio();

	}

	@Test(expected = TiempoInvalidoException.class)
	public void seQuiereAlquilarUnLibroPor3Cuatrimestres(){

		Producto fisicaIII = new Libro("Fisica III", new java.math.BigDecimal("100.00"));
		Alquiler alquilerCuatrimestral = new AlquilerCuatrimestral(new java.math.BigDecimal("800.00"), (Libro)fisicaIII, 3);

		alquilerCuatrimestral.getPrecio();

	}

}