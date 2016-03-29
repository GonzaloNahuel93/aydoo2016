package ar.edu.untref.aydoo;

public class MaquinaExpendedora {

	private HacedorDeCafeConLeche hacedorDeCafeConLeche;
	private HacedorDeTeConLeche hacedorDeTeConLeche;
	private Azucarero azucarero;

	/**
	 * @Pre: -
	 * @Post: Inicializa la Maquina Expendedora.
	 */
	public MaquinaExpendedora(){

		this.hacedorDeCafeConLeche = new HacedorDeCafeConLeche();
		this.hacedorDeTeConLeche = new HacedorDeTeConLeche();
		this.azucarero = new Azucarero();

	}

	/**
	 * @Pre: n es mayor que 0 (cero).
	 * @Post: La maquina expendedora prepara un cafe con leche con la cantidad de cucharadas de azucar deseadas.
	 * @param vaso
	 * @param n
	 * @return
	 */
	public Vaso hacerCafeConLecheConNDeAzucar(Vaso vaso, int n){

		vaso = this.verificarVasoDistintoDeNull(vaso);

		vaso = this.hacedorDeCafeConLeche.prepararEnEsteVaso(vaso);
		vaso = this.agregarAzucar(vaso, n);

		return vaso;

	}

	/**
	 * @Pre: n es mayor que 0 (cero).
	 * @Post: La maquina expendedora prepara un te con leche con la cantidad de cucharadas de azucar deseadas. 
	 * @param vaso
	 * @param n
	 * @return
	 */
	public Vaso hacerTeConLecheConNDeAzucar(Vaso vaso, int n){

		vaso = this.verificarVasoDistintoDeNull(vaso);

		vaso = this.hacedorDeTeConLeche.prepararEnEsteVaso(vaso);
		vaso = this.agregarAzucar(vaso, n);

		return vaso;

	}

	/**
	 * @Pre: vaso es igual a NULL.
	 * @Post: Crea un vaso y lo devuelve. Sino devuelve el mismo vaso ingresado.
	 * @param vaso
	 * @return
	 */
	private Vaso verificarVasoDistintoDeNull(Vaso vaso){

		if(vaso == null){

			Vaso vaso2 = new Vaso();
			vaso = vaso2;

		}

		return vaso;

	}

	/**
	 * @Pre: n es mayor que 0 (Cero).
	 * @Post: Se le agrega al vaso ingresado la cantidad de cucharadas de azucar deseadas.
	 * @param vaso
	 * @param n
	 * @return
	 */
	private Vaso agregarAzucar(Vaso vaso, int n){

		if(n > 0){

			vaso = this.azucarero.ponerNEnEsteVaso(vaso, n);

		}

		return vaso;

	}

}