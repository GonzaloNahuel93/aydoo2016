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

	@Test
	public void unClienteHaceUnaCompraYSeVerificaQueEsaCompraSeHayaGuardadoCorrectamente(){

		Cliente melisa = new Cliente("Melisa", "Bartolome Mitre 789");
		Mes marzo = new Mes("Marzo");
		Compra compra = new Compra(marzo);
		Producto cocina = new Libro("Cocina para principiantes", 100);

		compra.agregarProducto(cocina);
		melisa.agregarCompra(compra);

		Assert.assertEquals(1, melisa.getCompras().size());

	}

}