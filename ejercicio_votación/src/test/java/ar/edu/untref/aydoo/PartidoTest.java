package ar.edu.untref.aydoo;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PartidoTest {

	@Test
	public void seCreaUnPartidoConUnNombreYSeVerificaSiSeCreoConElNombreCorrecto(){

		Partido partido = new Partido("Cambiemos");
		String nombreObtenido = partido.getNombre();

		Assert.assertTrue(nombreObtenido.equals("Cambiemos"));

	}

}