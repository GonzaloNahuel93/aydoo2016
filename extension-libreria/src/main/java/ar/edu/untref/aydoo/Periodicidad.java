package ar.edu.untref.aydoo;

public enum Periodicidad {

	DIARIA(30),
	SEMANAL(4),
	QUINCENAL(2),
	MENSUAL(1);
	
	private int cantidadDeNumerosAlMes;
	
	private Periodicidad(int cantidadDeNumerosAlMes){
		this.cantidadDeNumerosAlMes = cantidadDeNumerosAlMes;
	}
	
	public int getCantidadDeNumerosAlMes(){
		return this.cantidadDeNumerosAlMes;
	}
		
}