package ar.edu.untref.aydoo;

import org.junit.Test;

public class AdministradorDeProgramaTest {

	@Test
	public void seQuiereImprimirPorConsolaLosFactoresPrimosDe360EnFormatoPrettyYConOrdenamientoAscendente(){

		String[] parametros = {"360", "--format=pretty", "--sort:asc"};
		AdministradorDePrograma administrador = new AdministradorDePrograma();

		administrador.realizarTarea(parametros);

	}

	@Test
	public void seQuiereComoSalidaUnArchivoQueMuestreLosFactoresPrimosDe360ConOrdenamientoDescendenteYFormatoQuiet(){

		String[] parametros = {"360", "--output-file=[QUIET] factores primos de 360.txt", "--sort:des", "--format=quiet"};
		AdministradorDePrograma administrador = new AdministradorDePrograma();

		administrador.realizarTarea(parametros);

	}

	@Test
	public void seQuiereSimplementeLosFactoresPrimosDe1000(){

		String[] parametros = {"1000"};
		AdministradorDePrograma administrador = new AdministradorDePrograma();

		administrador.realizarTarea(parametros);

	}

	@Test
	public void seQuiereSimplementeLosFactoresPrimosDe1000PeroEnUnArchivo(){

		String[] parametros = {"1000", "--output-file=[PRETTY] factores primos de 1000.txt"};
		AdministradorDePrograma administrador = new AdministradorDePrograma();

		administrador.realizarTarea(parametros);

	}

	@Test
	public void seQuiereImprimirPorConsolaLosFactoresPrimosDe500PeroEnFormatoQuiet(){

		String[] parametros = {"500", "--format=quiet"};
		AdministradorDePrograma administrador = new AdministradorDePrograma();

		administrador.realizarTarea(parametros);

	}

}