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

	@Test
	public void seCreaUnPartidoConUnNombreYDespuesSeCambiaParaVerificarSiSeHizoCorrectamenteElCambio(){

		Partido partido = new Partido("Pro");

		partido.setNombre("Cambiemos");
		String nombreObtenido = partido.getNombre();

		Assert.assertTrue(nombreObtenido.equals("Cambiemos"));

	}

	@Test
	public void seAgregaUnCandidatoAUnPartido(){

		Partido fpv = new Partido("Frente para la Victoria");
		Candidato scioli = new Candidato("Daniel Scioli");

		fpv.aniadirCandidato(scioli);
		List<Candidato> candidatos = fpv.getCandidatos();

		Assert.assertEquals(1, candidatos.size());

	}

	@Test
	public void seAgregaUnCandidatoAUnPartidoYSeVerificaQueEseCandidatoPertenezcaRealmenteAlPartidoEnElQueIngreso(){

		Partido fpv = new Partido("Frente para la Victoria");
		Candidato scioli = new Candidato("Daniel Scioli");

		fpv.aniadirCandidato(scioli);
		List<Candidato> candidatos = fpv.getCandidatos();
		Candidato candidato = candidatos.get(0);

		Assert.assertTrue(candidato.getPartido().getNombre().equals("Frente para la Victoria"));

	}

}