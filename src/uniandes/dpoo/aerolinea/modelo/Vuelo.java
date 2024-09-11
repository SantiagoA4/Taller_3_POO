package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {

	private Ruta ruta;
	private java.lang.String fecha;
	private Avion avion;
	private java.util.Map<java.lang.String, Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, java.lang.String fecha, Avion avion) {
		super();
        this.ruta = ruta;
        this.fecha = fecha;
        this.avion = avion;
    }
	
	public Ruta getRuta() {
		return ruta;
	}
	
	public java.lang.String getFecha() {
		return fecha;
	}
	
	public Avion getAvion() {
		return avion;
	}
	
	public java.util.Collection<Tiquete> getTiquetes() {
		return tiquetes.values();
	}
	
	public int venderTiquetes​(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException{
		return 0;
	}
	
	public boolean equals​(java.lang.Object obj) {
		return false;
	}
	
}
