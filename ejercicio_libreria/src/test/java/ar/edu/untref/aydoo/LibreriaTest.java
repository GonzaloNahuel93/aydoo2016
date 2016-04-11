package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LibreriaTest {

	@Before
	public void vaciarProductosDeLaLibreria(){

		Libreria libreria = Libreria.getInstance();
		libreria.productos.clear();

	}

	@Test
	public void seCreanTresProductosYSeVerificaQueLaLibreriaLosTengaRegistrados(){

		Libreria libreria = Libreria.getInstance();
		Producto libro = new Libro("Analisis y Diseño Orientado a Objetos", 500);
		Producto cuaderno = new ArticuloDeLibreria("Cuaderno rallado", 20);
		Periodicidad semanal = new Periodicidad("Semanal", 7);
		Producto revista = new Revista("Anteojitos", 40, semanal);

		libro.getDescripcion();
		cuaderno.getDescripcion();
		revista.getDescripcion();

		Assert.assertEquals(3, libreria.getProductos().size());

	}

	@Test
	public void unClienteCompraCuatroArticulosEnAgostoYNoEstaSuscriptoANinguno(){

		Libreria libreria = Libreria.getInstance();
		Cliente juan = new Cliente("Juan", "Juan Manuel de Rosas 4578");
		Mes agosto = new Mes("Agosto");
		Compra compra = new Compra(agosto);
		Producto elHobbit = new Libro("El Hobbit", 50);
		Producto lapicera1 = new ArticuloDeLibreria("Lapicera BIC", 5);
		Producto lapicera2 = new ArticuloDeLibreria("Lapicera BIC", 5);
		Periodicidad mensual = new Periodicidad("Mensual", 30);
		Producto elGrafico = new Revista("El Grafico", 30, mensual);

		libreria.agregarCliente(juan);
		compra.agregarProducto(elHobbit);
		compra.agregarProducto(lapicera1);
		compra.agregarProducto(lapicera2);
		compra.agregarProducto(elGrafico);
		juan.agregarCompra(compra);

		Assert.assertEquals(92.1, libreria.calcularMontoACobrar(agosto, juan), 0.0);

	}

}