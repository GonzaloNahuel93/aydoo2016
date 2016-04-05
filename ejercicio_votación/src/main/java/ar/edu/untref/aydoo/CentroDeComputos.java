package ar.edu.untref.aydoo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <Singleton>
 * @author Gonzalo Nahuel
 *
 */
public class CentroDeComputos {

	 private static CentroDeComputos instance = new CentroDeComputos();
	 private List<Voto> votos;

	 private CentroDeComputos(){
		 this.votos = new LinkedList<Voto>();
	 }

	 /**
	  * @Pre: -
	  * @Post: Devuelve la unica instancia de la clase.
	  * @return
	  */
	 public static CentroDeComputos getInstance() {

	      if(instance == null){

	         instance = new CentroDeComputos();

	      }

	      return instance;

	 }

	 /**
	  * @Pre: provincia es distinta de null y es valida (Se supone valida la entrada).
	  * @Post: Devuelve el Partido ganador en dicha provincia ingresada.
	  * @param provincia
	  * @return
	  */
	 public Partido partidoGanadorEnLaProvincia(String provincia){

		 provincia = provincia.trim();
		 provincia = provincia.toUpperCase();

		 Partido partidoGanador = null;

		 if(this.votos.size() != 0){

			 //1er PASO: Guardo en una lista la cantidad de votos que hay en la provincia dada.
			 List<Voto> votosEnLaProvinciaDada = new LinkedList<Voto>();

			 for(int i = 0 ; i < this.votos.size() ; i++){

				 if(this.votos.get(i).getProvinciaDeOrigen().equals(provincia)){

					 votosEnLaProvinciaDada.add(this.votos.get(i));

				 }

			 }

			 //2do PASO: Guardo en un mapa los votos obtenidos por cada partido en la provincia dada.
			 Map<Partido, Integer> partidosConSusVotosEnLaProvinciaDada = new HashMap<Partido, Integer>();

			 for(int i = 0 ; i < votosEnLaProvinciaDada.size() ; i++){

				 if(partidosConSusVotosEnLaProvinciaDada.containsKey(votosEnLaProvinciaDada.get(i).getCandidatoVotado().getPartido())){

					 Integer votosDelPartido = partidosConSusVotosEnLaProvinciaDada.get(votosEnLaProvinciaDada.get(i).getCandidatoVotado().getPartido()) + 1;
					 partidosConSusVotosEnLaProvinciaDada.put(votosEnLaProvinciaDada.get(i).getCandidatoVotado().getPartido(), votosDelPartido);

				 }else{

					 partidosConSusVotosEnLaProvinciaDada.put(votosEnLaProvinciaDada.get(i).getCandidatoVotado().getPartido(), 1);

				 }

			 }

			 //3er PASO: Recorro el mapa obteniendo su conjunto de claves para saber que partido tiene mas votos en la provincia dada.
			 Set<Partido> partidos = partidosConSusVotosEnLaProvinciaDada.keySet();

			 if(!partidos.isEmpty()){

				 Iterator<Partido> itPartidos = partidos.iterator();

				 partidoGanador = itPartidos.next();

				 while(itPartidos.hasNext()){

					 Partido partidoActual = itPartidos.next();

					 if(partidosConSusVotosEnLaProvinciaDada.get(partidoGanador) < partidosConSusVotosEnLaProvinciaDada.get(partidoActual)){

						 partidoGanador = partidoActual;

					 }

				 }

			 }

		 }

		 return partidoGanador;

	 }

	 /**
	  * @Pre: -
	  * @Post: Devuelve al Candidato ganador de las elecciones a nivel nacional.
	  * @return
	  */
	 public Candidato candidatoGanadorANivelNacional(){

		 Candidato candidatoGanador = null;

		 //1er PASO: Guardo en un mapa los votos obtenidos por cada candidato.
		 Map<Candidato, Integer> candidatosConSusVotos = new HashMap<Candidato, Integer>();

		 for(int i = 0 ; i < this.votos.size() ; i++){

			 if(candidatosConSusVotos.containsKey(this.votos.get(i).getCandidatoVotado())){

				 Integer votosDelCandidato = candidatosConSusVotos.get(this.votos.get(i).getCandidatoVotado()) + 1;
				 candidatosConSusVotos.put(this.votos.get(i).getCandidatoVotado(), votosDelCandidato);

			 }else{

				 candidatosConSusVotos.put(this.votos.get(i).getCandidatoVotado(), 1);

			 }

		 }

		 //2do PASO: Recorro el mapa obteniendo su conjunto de claves para saber que candidato tiene mas votos en todo el pais.
		 Set<Candidato> candidatos = candidatosConSusVotos.keySet();
		 Iterator<Candidato> itCandidatos = candidatos.iterator();

		 candidatoGanador = itCandidatos.next();

		 while(itCandidatos.hasNext()){

			 Candidato candidatoActual = itCandidatos.next();

			 if(candidatosConSusVotos.get(candidatoGanador) < candidatosConSusVotos.get(candidatoActual)){

				 candidatoGanador = candidatoActual;

			 }

		 }

		 return candidatoGanador;

	 }

	 protected void almacenarVoto(Voto voto){
		 this.votos.add(voto);
	 }

}