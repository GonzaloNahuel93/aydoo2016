package ar.edu.untref.aydoo;

public class HacedorDeCafeConLeche {

	private Cafetero cafetero;
	private Lechero lechero;

	public HacedorDeCafeConLeche(){

		this.cafetero = new Cafetero();
		this.lechero = new Lechero();

	}

	public Vaso prepararEnEsteVaso(Vaso vaso){

		vaso = this.cafetero.prepararEnEsteVaso(vaso);
		vaso = this.lechero.prepararEnEsteVaso(vaso);

		return vaso;

	}

}