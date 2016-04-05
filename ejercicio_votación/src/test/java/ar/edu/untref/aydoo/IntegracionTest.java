package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

public class IntegracionTest {

	@Test
	public void seVotaEnUnaProvinciaYSeVerificaQuePartidoGanoEnElla(){

		Candidato macri = new Candidato("Mauricio Macri");
		Partido cambiemos = new Partido("Cambiemos");
		macri.setPartido(cambiemos);
		Candidato scioli = new Candidato("Daniel Scioli");
		Partido fpv = new Partido("Frente para la Victoria");
		scioli.setPartido(fpv);

		Voto voto1 = new Voto();
		voto1.emitir("Buenos Aires", macri);
		Voto voto2 = new Voto();
		voto2.emitir("Buenos Aires", macri);
		Voto voto3 = new Voto();
		voto3.emitir("Buenos Aires", macri);
		Voto voto4 = new Voto();
		voto4.emitir("Buenos Aires", macri);
		Voto voto5 = new Voto();
		voto5.emitir("Buenos Aires", macri);
		Voto voto6 = new Voto();
		voto6.emitir("Buenos Aires", macri);
		Voto voto7 = new Voto();
		voto7.emitir("Buenos Aires", scioli);
		Voto voto8 = new Voto();
		voto8.emitir("Buenos Aires", scioli);
		Voto voto9 = new Voto();
		voto9.emitir("Buenos Aires", scioli);
		Voto voto10 = new Voto();
		voto10.emitir("Buenos Aires", scioli);

		Partido partidoGanadorEnBuenosAires = CentroDeComputos.getInstance().partidoGanadorEnLaProvincia("Buenos Aires");
		Assert.assertTrue(partidoGanadorEnBuenosAires.getNombre().equals("Cambiemos"));

	}

	@Test
	public void seVotaEnDosProvinciasPeroSePideElPartidoGanadorEnUnaSolaParaSaberSiEsCorrecto(){

		Candidato macri = new Candidato("Mauricio Macri");
		Partido cambiemos = new Partido("Cambiemos");
		macri.setPartido(cambiemos);
		Candidato scioli = new Candidato("Daniel Scioli");
		Partido fpv = new Partido("Frente para la Victoria");
		scioli.setPartido(fpv);

		Voto voto1 = new Voto();
		voto1.emitir("Buenos Aires", macri);
		Voto voto2 = new Voto();
		voto2.emitir("Buenos Aires", macri);
		Voto voto3 = new Voto();
		voto3.emitir("Buenos Aires", macri);
		Voto voto4 = new Voto();
		voto4.emitir("Buenos Aires", macri);
		Voto voto5 = new Voto();
		voto5.emitir("Buenos Aires", macri);
		Voto voto6 = new Voto();
		voto6.emitir("Rio Negro", macri);
		Voto voto7 = new Voto();
		voto7.emitir("Rio Negro", scioli);
		Voto voto8 = new Voto();
		voto8.emitir("Rio Negro", scioli);
		Voto voto9 = new Voto();
		voto9.emitir("Rio Negro", scioli);
		Voto voto10 = new Voto();
		voto10.emitir("Rio Negro", scioli);

		Partido partidoGanadorEnRioNegro = CentroDeComputos.getInstance().partidoGanadorEnLaProvincia("Rio Negro");	
		Assert.assertTrue(partidoGanadorEnRioNegro.getNombre().equals("Frente para la Victoria"));

	}

	@Test
	public void sePideElPartidoGanadorEnUnaProvinciaInvalida(){

		Candidato massa = new Candidato("Sergio Massa");
		Partido una = new Partido("Frente Renovador");
		massa.setPartido(una);

		Voto voto1 = new Voto();
		voto1.emitir("Buenos Aires", massa);
		Voto voto2 = new Voto();
		voto2.emitir("Buenos Aires", massa);
		Voto voto3 = new Voto();
		voto3.emitir("Buenos Aires", massa);

		Assert.assertNull(CentroDeComputos.getInstance().partidoGanadorEnLaProvincia("Italia"));

	}

}