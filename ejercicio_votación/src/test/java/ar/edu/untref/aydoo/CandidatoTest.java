package ar.edu.untref.aydoo;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class CandidatoTest {

	@Test
	public void seCreaUnCandidatoConUnNombreYApellidoYSeVerificaSiElDatoIngresadoSeGuardoDeFormaCorrecta(){

		Candidato macri = new Candidato("Mauricio Macri");
		String nombreObtenido = macri.getNombreYApellido();

		Assert.assertTrue(nombreObtenido.equals("MAURICIO MACRI"));

	}

	@Test
	public void seCreaUnCandidatoConUnNombreYApellidoYSeModificaParaVerificarSiElCambioSeEfectuoDeFormaCorrecta(){

		Candidato massa = new Candidato("Mauricio Macri");
		massa.setNombreYApellido("Sergio Massa");

		Assert.assertTrue(massa.getNombreYApellido().equals("SERGIO MASSA"));

	}

	@Test
	public void seCreaUnCandidatoYSeLeAsignaUnPartidoVerificandoQueElPartidoLoTengaRegistrado(){

		Candidato scioli = new Candidato("Daniel Scioli");
		Partido fpv = new Partido("Frente para la Victoria");

		scioli.setPartido(fpv);
		Partido partidoObtenido = scioli.getPartido();
		Candidato candidatoObtenido = fpv.getCandidatos().get(0);

		Assert.assertTrue(partidoObtenido.getNombre().equals("Frente para la Victoria"));
		Assert.assertTrue(candidatoObtenido.getNombreYApellido().equals("DANIEL SCIOLI"));

	}

}