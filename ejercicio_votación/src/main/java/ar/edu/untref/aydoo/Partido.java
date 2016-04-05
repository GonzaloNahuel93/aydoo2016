package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Partido {

	private String nombre;
	private List<Candidato> candidatos;

	/**
	 * @Pre: nombre es distinto de null (Se supone valida la entrada).
	 * @Post: Le asigna el nombre indicado al Partido.
	 * @param nombre
	 */
	public Partido(String nombre){

		this.nombre = nombre;
		this.candidatos = new LinkedList<Candidato>();

	}

	/**
	 * @Pre: -
	 * @Post: Devuelve el nombre del Partido.
	 * @return
	 */
	public String getNombre(){
		return this.nombre;
	}

	/**
	 * @Pre: nuevoNombre es distinto de null (Se supone valida la entrada).
	 * @Post: Modifica el nombre del Partido acorde al nombre indicado previamente.
	 * @param nuevoNombre
	 */
	public void setNombre(String nuevoNombre){
		this.nombre = nuevoNombre;
	}

	/**
	 * @Pre: candidato es distinto de null y no pertenece al Partido.
	 * @Post: Incorpora al Partido el candidato indicado previamente.
	 * @param candidato
	 */
	public void añadirCandidato(Candidato candidato){

		if(candidato != null && !this.candidatoExiste(candidato)){

			if(candidato.getPartido() != null){

				candidato.getPartido().eliminarCandidato(candidato.getNombreYApellido());

			}

			candidato.partido = this;
			this.candidatos.add(candidato);

		}

	}

	/**
	 * @Pre: nombreYApellido es distinto de null y hay un candidato dentro del Partido con ese nombre y apellido (Se supone valida la entrada).
	 * @Post: Elimina de la lista del Partido al candidato indicado previamente.
	 * @param nombreYApellido
	 */
	public void eliminarCandidato(String nombreYApellido){

		nombreYApellido = nombreYApellido.trim();
		nombreYApellido = nombreYApellido.toUpperCase();

		for(int i = 0 ; i < this.candidatos.size() ; i++){

			if(this.candidatos.get(i).getNombreYApellido().equals(nombreYApellido)){

				this.candidatos.get(i).partido = null;
				this.candidatos.remove(i);

			}

		}

	}

	/**
	 * @Pre: -
	 * @Post: Devuelve la lista con los candidatos que pertenecen al Partido.
	 * @return
	 */
	public List<Candidato> getCandidatos(){
		return this.candidatos;
	}

	private boolean candidatoExiste(Candidato candidato){

		boolean existe = false;
		int i = 0;

		while(i < this.candidatos.size() && !existe){

			if(this.candidatos.get(i).getNombreYApellido().equals(candidato.getNombreYApellido())){

				existe = true;

			}else{

				i++;

			}

		}

		return existe;

	}

}