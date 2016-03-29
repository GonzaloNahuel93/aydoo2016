package ar.edu.untref.aydoo;

import java.util.LinkedList;
import java.util.List;

public class Vaso {

	private List<String> contenido;

	public Vaso(){

		this.contenido = new LinkedList<String>();

	}

	public Vaso agregarContenido(String contenido){

		this.contenido.add(contenido);
		return this;

	}

	public List<String> verContenido(){
		return this.contenido;
	}

}