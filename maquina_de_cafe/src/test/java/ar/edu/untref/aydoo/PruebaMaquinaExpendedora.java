package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class PruebaMaquinaExpendedora {

	@Test
	public void hacerCafeConLecheCon3CucharadasDeAzucar(){

		MaquinaExpendedora maquina = new MaquinaExpendedora();

		Vaso vaso = new Vaso();
		Assert.assertEquals("El vaso esta vacio", 0, vaso.verContenido().size());

		vaso = maquina.hacerCafeConLecheConNDeAzucar(vaso, 3);
		Assert.assertEquals("El vaso tiene 3 contenidos", 3, vaso.verContenido().size());
		Assert.assertTrue("Hay Cafe", vaso.verContenido().get(0).equals("Cafe"));
		Assert.assertTrue("Hay Leche", vaso.verContenido().get(1).equals("Leche"));
		Assert.assertTrue("Hay 3 cucharadas de Azucar", vaso.verContenido().get(2).equals("3 cucharadas de Azucar"));

	}

	@Test
	public void hacerTeConLecheCon3CucharadasDeAzucar(){

		MaquinaExpendedora maquina = new MaquinaExpendedora();

		Vaso vaso = new Vaso();
		Assert.assertEquals("El Vaso esta vacío", 0, vaso.verContenido().size());

		vaso = maquina.hacerTeConLecheConNDeAzucar(vaso, 3);
		Assert.assertEquals("El vaso tiene 3 contenidos", 3, vaso.verContenido().size());
		Assert.assertTrue("Hay Te", vaso.verContenido().get(0).equals("Te"));
		Assert.assertTrue("Hay Leche", vaso.verContenido().get(1).equals("Leche"));
		Assert.assertTrue("Hay 3 cucharadas de Azucar", vaso.verContenido().get(2).equals("3 cucharadas de Azucar"));

	}

	@Test
	public void hacerCafeConLecheSinAzucar(){

		MaquinaExpendedora maquina = new MaquinaExpendedora();

		Vaso vaso = new Vaso();

		vaso = maquina.hacerCafeConLecheConNDeAzucar(vaso, 0);
		Assert.assertEquals("El vaso tiene 2 contenidos", 2, vaso.verContenido().size());
		Assert.assertTrue("Hay Cafe", vaso.verContenido().get(0).equals("Cafe"));
		Assert.assertTrue("Hay Leche", vaso.verContenido().get(1).equals("Leche"));

	}

	@Test
	public void hacerTeConLecheSinAzucar(){

		MaquinaExpendedora maquina = new MaquinaExpendedora();

		Vaso vaso = new Vaso();

		vaso = maquina.hacerTeConLecheConNDeAzucar(vaso, 0);
		Assert.assertEquals("El vaso tiene 2 contenidos", 2, vaso.verContenido().size());
		Assert.assertTrue("Hay Te", vaso.verContenido().get(0).equals("Te"));
		Assert.assertTrue("Hay Leche", vaso.verContenido().get(1).equals("Leche"));

	}

	@Test
	public void hacerCafeConLecheCon5CucharadasDeAzucar(){

		MaquinaExpendedora maquina = new MaquinaExpendedora();

		Vaso vaso = new Vaso();

		vaso = maquina.hacerCafeConLecheConNDeAzucar(vaso, 5);
		Assert.assertEquals("El vaso tiene 3 contenidos", 3, vaso.verContenido().size());
		Assert.assertTrue("Hay Cafe", vaso.verContenido().get(0).equals("Cafe"));
		Assert.assertTrue("Hay Leche", vaso.verContenido().get(1).equals("Leche"));
		Assert.assertTrue("Hay 5 cucharadas de Azucar", vaso.verContenido().get(2).equals("5 cucharadas de Azucar"));

	}

}