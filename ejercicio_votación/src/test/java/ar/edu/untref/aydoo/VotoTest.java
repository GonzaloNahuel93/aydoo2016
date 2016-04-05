package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class VotoTest {

	@Test
	public void seCreaYSeEmiteUnVotoColocandoProvinciaDeOrigenYCandidatoElegidoComprobandoSiLosDatosIngresadosSeGuardaronDeFormaCorrecta(){

		Voto voto = new Voto();
		Candidato macri = new Candidato("Mauricio Macri");

		voto.emitir(" Buenos Aires ", macri);

		Assert.assertTrue(voto.getProvinciaDeOrigen().equals("BUENOS AIRES"));
		Assert.assertTrue(voto.getCandidatoVotado().getNombreYApellido().equals("MAURICIO MACRI"));

	}

	@Test
	public void seCreaUnVotoYSeEmiteEnBlanco(){

		Voto voto = new Voto();
		voto.emitirEnBlanco();

		Assert.assertNull(voto.getCandidatoVotado());
		Assert.assertNull(voto.getProvinciaDeOrigen());

	}

}