package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class CompraTest {

	@Test
	public void seCreaUnaCompraConUnMesYSeVerificaSiSeCreoConElMesIndicado(){

		Mes enero = new Mes("Enero");
		Compra compra = new Compra(enero);

		Assert.assertTrue(compra.getMes().getNombre().equals("Enero"));

	}

}