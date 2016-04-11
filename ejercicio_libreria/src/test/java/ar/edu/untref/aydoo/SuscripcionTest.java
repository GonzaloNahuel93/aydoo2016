package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class SuscripcionTest {

	@Test
	public void seCreaUnaSuscripcionNoAnualYSeVerificaSiSeGuardaronCorrectamenteLosDatos(){

		Cliente leonel = new Cliente("Leonel", "Irigoyen 150");
		Periodicidad semanal = new Periodicidad("Semanal", 7);
		Suscriptible revista = new Revista("Tecnologia", 10, semanal);
		boolean esAnual = false;
		Suscripcion suscripcion = new Suscripcion(leonel, revista, esAnual);

		Cliente clienteObtenido = suscripcion.getCliente();
		Suscriptible suscriptibleObtenido = suscripcion.getSuscriptible();
		boolean booleanObtenido = suscripcion.esAnual();

		Assert.assertTrue(clienteObtenido.getNombre().equals("Leonel"));
		Assert.assertTrue(((Producto)suscriptibleObtenido).getDescripcion().equals("Tecnologia"));
		Assert.assertFalse(booleanObtenido);

	}

}