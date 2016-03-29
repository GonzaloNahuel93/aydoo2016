package ar.edu.untref.aydoo;

public class MaquinaExpendedora {

	private HacedorDeCafeConLeche hacedorDeCafeConLeche;
	private HacedorDeTeConLeche hacedorDeTeConLeche;
	private Azucarero azucarero;

	public MaquinaExpendedora(){

		this.hacedorDeCafeConLeche = new HacedorDeCafeConLeche();
		this.hacedorDeTeConLeche = new HacedorDeTeConLeche();
		this.azucarero = new Azucarero();

	}

	public Vaso hacerCafeConLecheConNDeAzucar(Vaso vaso, int n){

		vaso = this.hacedorDeCafeConLeche.prepararEnEsteVaso(vaso);
		vaso = this.agregarAzucar(vaso, n);

		return vaso;

	}

	public Vaso hacerTeConLecheConNDeAzucar(Vaso vaso, int n){

		vaso = this.hacedorDeTeConLeche.prepararEnEsteVaso(vaso);
		vaso = this.agregarAzucar(vaso, n);

		return vaso;

	}

	private Vaso agregarAzucar(Vaso vaso, int n){

		if(n > 0){

			vaso = this.azucarero.ponerNEnEsteVaso(vaso, n);

		}

		return vaso;

	}

}