package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class OrdenadorDeFactoresPrimos {

	/**
	 * @Pre: factoresPrimos es una lista ordenada ascendentemente (Entrada valida ya que la lista retornada por la clase FactoresPrimos cumple con este
	 * 		 requisito), y criterioDeOrden es valido.
	 * @Post: Devuelve la lista ordenada acorde al criterio insertado.
	 */
	public List<Integer> ordenar(List<Integer> factoresPrimos, String criterioDeOrden) {

		List<Integer> factoresPrimosOrdenados = new ArrayList<Integer>();

		if("--sort:des".equals(criterioDeOrden)){

			factoresPrimosOrdenados = this.invertirLista(factoresPrimos);

		}else if("--sort:asc".equals(criterioDeOrden) || " ".equals(criterioDeOrden)){

			factoresPrimosOrdenados = factoresPrimos;

		}else{

			System.out.println("Ordenamiento no aceptado. Las opciones posibles son : des o asc.");

		}

		return factoresPrimosOrdenados;

	}

	private List<Integer> invertirLista(List<Integer> listaAInvertir){

		List<Integer> listaInvertida = new ArrayList<Integer>();

		for(int i = listaAInvertir.size() ; i > 0 ; i--){

			Integer numeroActual = listaAInvertir.get(i - 1);
			listaInvertida.add(numeroActual);

		}

		return listaInvertida;

	}

}