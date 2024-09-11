package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta {

	protected final int COSTO_POR_KM = 1000;
	
	public CalculadoraTarifasTemporadaAlta() {
		super();
	}
	
	public int calcularCostoBase​(Vuelo vuelo, Cliente cliente) {
		Ruta ruta = vuelo.getRuta();
		int distancia = Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
		int costoBase = distancia * COSTO_POR_KM;
		return costoBase;
	}
	
	public double calcularPorcentajeDescuento​(Cliente cliente) {
		
	    return 0.1;
	}
}
