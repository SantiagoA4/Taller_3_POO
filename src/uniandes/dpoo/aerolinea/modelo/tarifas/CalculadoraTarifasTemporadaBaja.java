package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas {

	private static final int COSTO_POR_KM_NATURAL = 600;
    private static final int COSTO_POR_KM_CORPORATIVO = 900;
    private static final double DESCUENTO_PEQ = 0.02;
    private static final double DESCUENTO_MEDIANAS = 0.1;
    private static final double DESCUENTO_GRANDES = 0.2;
	
    public CalculadoraTarifasTemporadaBaja() {
		super();
	}

    public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
    	Ruta ruta = vuelo.getRuta();
        int distancia = Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
        int costoPorKm;

        if (cliente.getTipoCliente() == "Corporativo") {
            costoPorKm = COSTO_POR_KM_CORPORATIVO;
        } else {
            costoPorKm = COSTO_POR_KM_NATURAL;
        }

        return costoPorKm * distancia;
    }
    
	public double calcularPorcentajeDescuento(Cliente cliente) {
		if (cliente.getTipoCliente() == "Pequenio") {
			return DESCUENTO_PEQ;
		} else if (cliente.getTipoCliente() == "Mediano") {
			return DESCUENTO_MEDIANAS;
		} else {
			return DESCUENTO_GRANDES;
		}
	}
    
	
}
