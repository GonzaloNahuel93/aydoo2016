package ar.edu.untref.aydoo;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

	@Test
	public void calcularMontoACobrarEnAgostoAJuan(){

		Cliente cliente = new Cliente("Juan", "Perez", "Lopez y Planes 4567");
		Libreria libreria = new Libreria("Libritos");
		Compra compra = new Compra(Mes.AGOSTO, cliente);
		Producto libroElHobbit = new Libro("El Hobbit", new java.math.BigDecimal("50.00"));
		compra.agregarProducto(libroElHobbit);
		Producto articuloDeLibreriaLapicera1 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00")); 
		compra.agregarProducto(articuloDeLibreriaLapicera1);
		Producto articuloDeLibreriaLapicera2 = new ArticuloDeLibreria("Lapicera", new java.math.BigDecimal("5.00")); 
		compra.agregarProducto(articuloDeLibreriaLapicera2);
		Producto revistaElGrafico = new DiarioYRevista("El Grafico", new java.math.BigDecimal("30.00"), Periodicidad.MENSUAL); 
		compra.agregarProducto(revistaElGrafico);
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("92.10");
		libreria.agregarCompra(compra);

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.AGOSTO, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void calcularMontoACobrarEnEneroAMaria(){

		Cliente cliente = new Cliente("Maria", "Gomez", "Gabino Ezeiza 9730");
		Libreria libreria = new Libreria("Libritos");
		Compra compra = new Compra(Mes.ENERO, cliente);
		Producto diarioPagina12 = new DiarioYRevista("Pagina 12", new java.math.BigDecimal("12.00"), Periodicidad.DIARIA); 
		compra.agregarProducto(diarioPagina12);
		DiarioYRevista revistaBarcelona = new DiarioYRevista("Revista Barcelona", new java.math.BigDecimal("20.00"), Periodicidad.QUINCENAL);
		Producto suscripcionAnualARevistaBarcelona = new Suscripcion("Suscripcion anual a Revista Barcelona", 
																	new java.math.BigDecimal("20.00"), 
																	revistaBarcelona, TipoSuscripcion.ANUAL);		
		compra.agregarProducto(suscripcionAnualARevistaBarcelona);				

		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("44.00");
		libreria.agregarCompra(compra);

		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.ENERO, cliente);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void seCalculaElMontoACobrarDeUnClientePorElAlquilerDiarioDeUnLibro(){

		Libreria libreria = new Libreria("Libreria... De Libros!");
		Cliente gonzalo = new Cliente("Gonzalo Nahuel", "Di Pierro", "Lynch 4500");
		Producto harryPotter = new Libro("Harry Potter y la Piedra Filosofal", new java.math.BigDecimal("250.00"));
		Alquiler alquilerDiario = new AlquilerDiario(new java.math.BigDecimal("10.00"), (Libro)harryPotter, 10);

		libreria.agregarAlquiler(Mes.ENERO, gonzalo, alquilerDiario);
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("100.00");
		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.ENERO, gonzalo);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void seCalculaElMontoACobrarDeUnClientePorElAlquilerMensualDeUnLibro(){

		Libreria libreria = new Libreria("Libreria... De Libros!");
		Cliente matias = new Cliente("Matias", "Fabro", "Juan Manuel Belgrano 230");
		Producto tecnologiaInnovadora = new Libro("Tecnologia Innovadora", new java.math.BigDecimal("300.00"));
		Alquiler alquilerMensual = new AlquilerMensual(new java.math.BigDecimal("200.00"), (Libro)tecnologiaInnovadora, 3);

		libreria.agregarAlquiler(Mes.FEBRERO, matias, alquilerMensual);
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("600.00");
		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.FEBRERO, matias);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void seCalculaElMontoACobrarDeUnClientePorElAlquilerCuatrimestralDeUnLibro(){

		Libreria libreria = new Libreria("Libreria... De Libros!");
		Cliente ariel = new Cliente("Ariel", "Puerta", "Rebizzo 485");
		Producto inteligenciaArtificial = new Libro("Inteligencia Artificial", new java.math.BigDecimal("500.00"));
		Alquiler alquilerCuatrimestral = new AlquilerCuatrimestral(new java.math.BigDecimal("800.00"), (Libro)inteligenciaArtificial, 2);

		libreria.agregarAlquiler(Mes.MARZO, ariel, alquilerCuatrimestral);
		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("1280.00");
		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.MARZO, ariel);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test
	public void unClienteAlquilaUnLibroDiariamenteOtroMensualmenteYOtroCuatrimestralmente(){

		Libreria libreria = new Libreria("Libreria UNTREF");
		Cliente gonzaloNahuel = new Cliente("Gonzalo Nahuel", "Di Pierro", "Caseros 1500");
		Producto ayde = new Libro("Analisis y Diseño Estructurado", new java.math.BigDecimal("150.00"));
		Producto aydoo = new Libro("Analisis y Diseño Orientado a Objetos", new java.math.BigDecimal("150.00"));
		Producto ayddsetr = new Libro("Analisis y Diseño de Sistemas en Tiempo Real", new java.math.BigDecimal("150.00"));
		Alquiler alquilerDiario = new AlquilerDiario(new java.math.BigDecimal("10.00"), (Libro)ayde, 15);
		Alquiler alquilerMensual = new AlquilerMensual(new java.math.BigDecimal("200.00"), (Libro)aydoo, 1);
		Alquiler alquilerCuatrimestral = new AlquilerCuatrimestral(new java.math.BigDecimal("800.00"), (Libro)ayddsetr, 1);
		libreria.agregarAlquiler(Mes.ABRIL, gonzaloNahuel, alquilerDiario);
		libreria.agregarAlquiler(Mes.ABRIL, gonzaloNahuel, alquilerMensual);
		libreria.agregarAlquiler(Mes.ABRIL, gonzaloNahuel, alquilerCuatrimestral);

		BigDecimal montoACobrarEsperado = new java.math.BigDecimal("1070.00");
		BigDecimal montoACobrarObtenido = libreria.calcularMontoACobrar(Mes.ABRIL, gonzaloNahuel);

		Assert.assertEquals(montoACobrarEsperado, montoACobrarObtenido);

	}

	@Test(expected = LibroAlquiladoException.class)
	public void seQuiereAlquilarMensualmenteUnLibroQueYaFueAlquiladoDiariamente(){

		Producto informatica = new Libro("El increible y peligroso mundo de la Informatica", new java.math.BigDecimal("1000.00"));
		Alquiler alquilerDiario = new AlquilerDiario(new java.math.BigDecimal("10.00"), (Libro)informatica, 20);
		alquilerDiario.getDescripcion();

		Alquiler alquilerCuatrimestral = new AlquilerCuatrimestral(new java.math.BigDecimal("800.00"), (Libro)informatica, 2);
		alquilerCuatrimestral.getDescripcion();

	}

}