package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void seCreaUnClienteConUnNombreYUnaDireccionYSeVerificaQueSeHayanGuardadoCorrectamenteLosDatosInsertados(){

		Cliente nahuel = new Cliente("Nahuel", "Olavarria 5700");

		Assert.assertTrue(nahuel.getNombre().equals("Nahuel"));
		Assert.assertTrue(nahuel.getDireccion().equals("Olavarria 5700"));

	}

}