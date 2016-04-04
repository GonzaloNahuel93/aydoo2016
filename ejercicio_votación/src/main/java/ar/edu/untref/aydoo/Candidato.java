package ar.edu.untref.aydoo;

public class Candidato {

	private String nombreYApellido;
	protected Partido partido;

	/**
	 * @Pre: nombreYApellido es distinto de null (Se supone valida la entrada).
	 * @Post: Inicia el Candidato con el nombre y apellido especificado.
	 * @param nombreYApellido
	 */
	public Candidato(String nombreYApellido){
		this.setNombreYApellido(nombreYApellido);
	}

	/**
	 * @Pre: -
	 * @Post: Devuelve el nombre y apellido del Candidato.
	 * @return
	 */
	public String getNombreYApellido(){
		return this.nombreYApellido;
	}

	/**
	 * @Pre: nuevoNombreYApellido es distinto de null (Se supone valida la entrada).
	 * @Post: Cambia el nombre y apellido del Candidato acorde al nombre y apellido especificado previamente.
	 * @param nuevoNombreYApellido
	 */
	public void setNombreYApellido(String nuevoNombreYApellido){

		nuevoNombreYApellido = nuevoNombreYApellido.trim();
		nuevoNombreYApellido = nuevoNombreYApellido.toUpperCase();

		this.nombreYApellido = nuevoNombreYApellido;

	}

	/**
	 * @Pre: -
	 * @Post: Devuelve el Partido al que pertenece el Candidato.
	 * @return
	 */
	public Partido getPartido(){
		return this.partido;
	}

	/**
	 * @Pre: -
	 * @Post: Cambia el Partido al que pertenece el Candidato acorde al Partido especificado previamente.
	 * @param nuevoPartido
	 */
	public void setPartido(Partido nuevoPartido){

		//1ra Opcion: El candidato ya pertenece a un partido determinado pero se quiere pasar a otro DIFERENTE.
		if(this.partido != null && nuevoPartido != null && !nuevoPartido.getNombre().equals(this.partido.getNombre())){

			this.partido.eliminarCandidato(this.getNombreYApellido());
			nuevoPartido.añadirCandidato(this);

		//2da Opcion: El candidato ya pertenece a un partido determinado pero solamente se quiere salir sin entrar a otro (Quedarse en forma independiente).
		}else if(this.partido != null && nuevoPartido == null){

			this.partido.eliminarCandidato(this.getNombreYApellido());

		//3ra Opcion: El candidato no pertenece a ningun partido pero quiere ingresar a uno.
		}else if(this.partido == null && nuevoPartido != null){

			nuevoPartido.añadirCandidato(this);

		}

	}

}