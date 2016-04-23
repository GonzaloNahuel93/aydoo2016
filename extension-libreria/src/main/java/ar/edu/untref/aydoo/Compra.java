package ar.edu.untref.aydoo;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private Mes mes;
	private Cliente cliente;
	private List<Producto> productos;
	
	public Compra(Mes mes, Cliente cliente){
		this.mes = mes;
		this.setCliente(cliente);
		this.setProductos(new ArrayList<Producto>());
	}
	
	public void agregarProducto(Producto producto){
		getProductos().add(producto);
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
}