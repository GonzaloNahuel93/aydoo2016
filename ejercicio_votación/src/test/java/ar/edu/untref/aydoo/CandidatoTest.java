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

}