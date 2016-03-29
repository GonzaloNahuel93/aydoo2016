package ar.edu.untref.aydoo;

public class HacedorDeTeConLeche {

	private HacedorDeTe hacedorDeTe;
	private Lechero lechero;

	public HacedorDeTeConLeche(){

		this.hacedorDeTe = new HacedorDeTe();
		this.lechero = new Lechero();

	}

	public Vaso prepararEnEsteVaso(Vaso vaso){

		vaso = this.hacedorDeTe.prepararEnEsteVaso(vaso);
		vaso = this.lechero.prepararEnEsteVaso(vaso);

		return vaso;

	}

}