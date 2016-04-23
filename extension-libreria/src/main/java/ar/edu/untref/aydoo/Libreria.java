package ar.edu.untref.aydoo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libreria {
	
	private String nombre;
	private List<Compra> compras;
	
	public Libreria(String nombre){
		this.nombre = nombre;
		this.compras = new ArrayList<Compra>();
	}
	
	public BigDecimal calcularMontoACobrar(Mes mes, Cliente cliente){	
		
		BigDecimal montoACobrar = new java.math.BigDecimal("0.00");
		Compra compraAComparar;
		Cliente clienteAComparar;
		Mes mesAComparar;
		
		boolean encontrada = false;
		Iterator<Compra> itCompras = compras.iterator();
		while(itCompras.hasNext() && !encontrada){
			compraAComparar = itCompras.next();
			clienteAComparar = compraAComparar.getCliente();
			mesAComparar = compraAComparar.getMes();
			if (clienteAComparar.equals(cliente) && mesAComparar.equals(mes)){
				montoACobrar = calcularMontoDeCompra(compraAComparar.getProductos());
				encontrada = true;
			}
		}
		
		return montoACobrar;
	}

	private BigDecimal calcularMontoDeCompra(List<Producto> productos) {
		
		BigDecimal montoDeCompra = new java.math.BigDecimal("0.00");
		
		for (Producto producto : productos){
			montoDeCompra = montoDeCompra.add(producto.getPrecio()); 
		}

		return montoDeCompra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
}