package ar.edu.untref.aydoo;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class AlquilerMensualTest {

	@Test
	public void seQuiereAlquilarUnLibroPor2Meses(){

		Producto analisisI = new Libro("Analisis Matematico I", new java.math.BigDecimal("100.00"));
		Alquiler alquilerMensual = new AlquilerMensual(new java.math.BigDecimal("200.00"), (Libro)analisisI, 2);

		BigDecimal precioEsperado = new BigDecimal("400.00");
		BigDecimal precioObtenido = alquilerMensual.getPrecio();

		Assert.assertEquals(precioEsperado, precioObtenido);

	}

	@Test(expected = TiempoInvalidoException.class)
	public void seQuiereAlquilarUnLibroPor0Meses(){

		Producto analisisII = new Libro("Analisis Matematico II", new java.math.BigDecimal("100.00"));
		Alquiler alquilerMensual = new AlquilerMensual(new java.math.BigDecimal("200.00"), (Libro)analisisII, 0);

		alquilerMensual.getPrecio();

	}

	@Test(expected = TiempoInvalidoException.class)
	public void seQuiereAlquilarUnLibroPor4Meses(){

		Producto analisisIII = new Libro("Analisis Matematico III", new java.math.BigDecimal("100.00"));
		Alquiler alquilerMensual = new AlquilerMensual(new java.math.BigDecimal("200.00"), (Libro)analisisIII, 4);

		alquilerMensual.getPrecio();

	}

}