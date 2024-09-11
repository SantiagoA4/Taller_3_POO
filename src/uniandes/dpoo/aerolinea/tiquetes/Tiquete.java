package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {

	private String codigo;
	private int tarifa;
	private boolean usado;
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		super();
		this.codigo = codigo;
		this.tarifa = tarifa;
	}
	
	public Cliente getCliente() {
		Cliente cliente = getCliente();
		return cliente;
	}
	
	public Vuelo getVuelo() {
		Vuelo vuelo = getVuelo();
		return vuelo;
	}
	
	public String getCodigo() {
		return codigo;
    }

	public int getTarifa() {
		return tarifa;
	}
	
	public void marcarComoUsado() {
		usado = true;
	}
	
	public boolean esUsado() {
		return usado;
	}
	
}
