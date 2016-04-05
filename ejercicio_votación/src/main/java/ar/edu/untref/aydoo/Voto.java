package ar.edu.untref.aydoo;

public class Voto {

	private boolean emitido;
	private String provinciaDeOrigen;
	private Candidato candidatoVotado;

	private String[] provinciasValidas;

	/**
	 * @Pre: -
	 * @Post: Se inicializa el Voto para poder emitirlo posteriormente.
	 */
	public Voto(){

		this.emitido = false;
		this.candidatoVotado = null;
		this.provinciaDeOrigen = null;

		this.provinciasValidas = new String[23];
		this.provinciasValidas[0] = "BUENOS AIRES";
		this.provinciasValidas[1] = "CATAMARCA";
		this.provinciasValidas[2] = "CHACO";
		this.provinciasValidas[3] = "CHUBUT";
		this.provinciasValidas[4] = "CORDOBA";
		this.provinciasValidas[5] = "CORRIENTES";
		this.provinciasValidas[6] = "ENTRE RIOS";
		this.provinciasValidas[7] = "FORMOSA";
		this.provinciasValidas[8] = "JUJUY";
		this.provinciasValidas[9] = "LA PAMPA";
		this.provinciasValidas[10] = "LA RIOJA";
		this.provinciasValidas[11] = "MENDOZA";
		this.provinciasValidas[12] = "MISIONES";
		this.provinciasValidas[13] = "NEUQUEN";
		this.provinciasValidas[14] = "RIO NEGRO";
		this.provinciasValidas[15] = "SALTA";
		this.provinciasValidas[16] = "SAN JUAN";
		this.provinciasValidas[17] = "SAN LUIS";
		this.provinciasValidas[18] = "SANTA CRUZ";
		this.provinciasValidas[19] = "SANTA FE";
		this.provinciasValidas[20] = "SANTIAGO DEL ESTERO";
		this.provinciasValidas[21] = "TIERRA DEL FUEGO";
		this.provinciasValidas[22] = "TUCUMAN";

	}

	/**
	 * @Pre: El Voto todavia no fue emitido, provinciaDeOrigen y candidatoVotado son distintos de null, y provinciaDeOrigen es valida.
	 * @Post: Se emite el Voto con provinciaDeOrigen y candidatoVotado especificados.
	 * @param provinciaDeOrigen
	 * @param candidatoVotado
	 * @throws RuntimeException
	 */
	public void emitir(String provinciaDeOrigen, Candidato candidatoVotado) throws RuntimeException{

		if(!this.emitido){

			if((provinciaDeOrigen != null && this.provinciaValida(provinciaDeOrigen)) && candidatoVotado != null){

				this.provinciaDeOrigen = this.pasarPalabraAFormatoPredeterminado(provinciaDeOrigen);
				this.candidatoVotado = candidatoVotado;

				this.emitido = true;

				CentroDeComputos.getInstance().validarYAlmacenarVoto(this);

			}else{

				throw new DatoInvalidoException();

			}

		}else{

			throw new VotoEmitidoException();

		}

	}

	/**
	 * @Pre: El Voto todavia no fue emitido.
	 * @Post: Se emite el Voto en blanco.
	 * @throws RuntimeException
	 */
	public void emitirEnBlanco() throws RuntimeException{

		if(!this.emitido){

			this.emitido = true;

		}else{

			throw new VotoEmitidoException();

		}

	}

	/**
	 * @Pre: -
	 * @Post: Devuelve el Candidato votado.
	 * @return
	 */
	public Candidato getCandidatoVotado(){
		return this.candidatoVotado;
	}

	/**
	 * @Pre: -
	 * @Post: Devuelve la provincia en donde se emitio el Voto.
	 * @return
	 */
	public String getProvinciaDeOrigen(){
		return this.provinciaDeOrigen;
	}

	private String pasarPalabraAFormatoPredeterminado(String palabra){

		palabra = palabra.trim();
		palabra = palabra.toUpperCase();

		return palabra;

	}

	private boolean provinciaValida(String provincia){

		provincia = this.pasarPalabraAFormatoPredeterminado(provincia);

		boolean provinciaValida = false;

		for(int i = 0 ; i < this.provinciasValidas.length ; i++){

			if(this.provinciasValidas[i].equals(provincia)){

				provinciaValida = true;

			}

		}

		return provinciaValida;

	}

}