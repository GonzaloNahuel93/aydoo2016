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

	@Test(expected = VotoEmitidoException.class)
	public void seQuiereVolverAEmitirUnVotoUnaVezQueYaFueEmitidoConOtroCandidato(){

		Voto voto = new Voto();
		Candidato scioli = new Candidato("Daniel Scioli");
		Candidato macri = new Candidato("Mauricio Macri");

		voto.emitir("Rio Negro", scioli);
		voto.emitir("Rio Negro", macri);

	}

	@Test(expected = VotoEmitidoException.class)
	public void seQuiereVolverAEmitirUnVotoUnaVezQueYaFueEmitidoEnBlanco(){

		Voto voto = new Voto();
		Candidato scioli = new Candidato("Daniel Scioli");

		voto.emitirEnBlanco();

		voto.emitir("Buenos Aires", scioli);

	}

	@Test(expected = VotoEmitidoException.class)
	public void seQuiereEmitirUnVotoEnBlancoUnaVezQueYaFueEmitidoConLosDatosRequeridos(){

		Voto voto = new Voto();
		Candidato stolbizer = new Candidato("Margarita Stolbizer");

		voto.emitir("Buenos Aires", stolbizer);

		voto.emitirEnBlanco();

	}

	@Test(expected = VotoEmitidoException.class)
	public void seQuiereEmitirEnBlancoUnVotoDosVeces(){

		Voto voto = new Voto();
		voto.emitirEnBlanco();

		voto.emitirEnBlanco();

	}

	@Test(expected = DatoInvalidoException.class)
	public void seQuiereEmitirUnVotoColocandoLaProvinciaDeOrigenYElCandidatoComoNulos(){

		Voto voto = new Voto();
		voto.emitir(null, null);

	}

	@Test(expected = DatoInvalidoException.class)
	public void seQuiereEmitirUnVotoColocandoUnaProvinciaComoNula(){

		Voto voto = new Voto();
		Candidato stolbizer = new Candidato("Margarita Stolbizer");

		voto.emitir(null, stolbizer);

	}

	@Test(expected = DatoInvalidoException.class)
	public void seQuiereEmitirUnVotoColocandoUnCandidatoComoNulo(){

		Voto voto = new Voto();
		voto.emitir("Buenos Aires", null);

	}

	@Test(expected = DatoInvalidoException.class)
	public void seQuiereEmitirUnVotoColocandoUnaProvinciaInvalida(){

		Voto voto = new Voto();
		Candidato delCanio = new Candidato("Nicolas Del Canio");

		voto.emitir("Italia", delCanio);

	}

}