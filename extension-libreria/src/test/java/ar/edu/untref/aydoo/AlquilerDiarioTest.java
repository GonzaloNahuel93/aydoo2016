package ar.edu.untref.aydoo;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class AlquilerDiarioTest {

	@Test
	public void seQuiereAlquilarUnLibroPor15Dias(){

		Producto ingenieriaInformatica = new Libro("Ingenieria Informatica", new java.math.BigDecimal("100.00"));
		Alquiler alquilerDiario = new AlquilerDiario(new java.math.BigDecimal("10.00"), (Libro)ingenieriaInformatica, 15);

		BigDecimal precioEsperado = new BigDecimal("150.00");
		BigDecimal precioObtenido = alquilerDiario.getPrecio();

		Assert.assertEquals(precioEsperado, precioObtenido);

	}

	@Test(expected = TiempoInvalidoException.class)
	public void seQuiereAlquilarUnLibroPor2Dias(){

		Producto ingenieriaAeronautica = new Libro("Ingenieria Aeronautica", new java.math.BigDecimal("100.00"));
		Alquiler alquilerDiario = new AlquilerDiario(new java.math.BigDecimal("10.00"), (Libro)ingenieriaAeronautica, 2);

		alquilerDiario.getPrecio();

	}

	@Test(expected = TiempoInvalidoException.class)
	public void seQuiereAlquilarUnLibroPor26Dias(){

		Producto ingenieriaNaval = new Libro("Ingenieria Naval", new java.math.BigDecimal("100.00"));
		Alquiler alquilerDiario = new AlquilerDiario(new java.math.BigDecimal("10.00"), (Libro)ingenieriaNaval, 26);

		alquilerDiario.getPrecio();

	}

}