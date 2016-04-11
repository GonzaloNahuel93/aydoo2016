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

}