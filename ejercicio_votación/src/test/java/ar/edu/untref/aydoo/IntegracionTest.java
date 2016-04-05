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

}