package ar.edu.untref.aydoo;

import java.util.List;

public class AdministradorDePrograma {

	private OrdenadorDeParametros ordenadorParametrico;
	private FactoresPrimos factorizacion;
	private OrdenadorDeFactoresPrimos ordenador;
	private Formateador formateador;

	public AdministradorDePrograma(){

		this.ordenadorParametrico = new OrdenadorDeParametros();
		this.factorizacion = new FactoresPrimos();
		this.ordenador = new OrdenadorDeFactoresPrimos();
		this.formateador = new Formateador();

	}

	public void realizarTarea(String[] parametrosDeEntrada){

		//1er PASO: Ordenar los datos ingresados [Por convencion, el orden es: 1)NUMERO A FACTORIZAR, 2)FORMATO, 3)ORDEN, 4)SALIDA DE ARCHIVO (OPCIONAL)]
		//parametros[0] = NUMERO A FACTORIZAR.
		//parametros[1] = FORMATO.
		//parametros[2] = ORDEN.
		//parametros[3] = SALIDA DE ARCHIVO [OPCIONAL].
		String[] parametros = this.ordenadorParametrico.ordenar(parametrosDeEntrada);

		//2do PASO: Obtener Factores Primos
		int numero = Integer.parseInt(parametros[0]);
		List<Integer> factoresPrimos = this.factorizacion.obtenerFactoresPrimos(numero);

		//3er PASO: Ordenar la lista de Factores Primos acorde al criterio de orden pedido (DESCENDENTEMENTE o ASCENDENTEMENTE)
		List<Integer> factoresPrimosOrdenados = this.ordenador.ordenar(factoresPrimos, parametros[2]);

		//4to PASO: Generar la salida (Impresion por consola o generacion de archivo) acorde al formato pedido (PRETTY o QUIET)
		if(!factoresPrimosOrdenados.isEmpty()){
			this.formateador.getSalida(factoresPrimosOrdenados, parametros[1], parametros[3]);
		}

	}

}