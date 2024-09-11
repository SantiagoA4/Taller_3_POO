package uniandes.dpoo.aerolinea.modelo.cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;



public abstract class Cliente {

	private java.util.List<Tiquete> tiquetesSinUsar;
	private java.util.List<Tiquete> tiquetesUsados;
	
	public Cliente() {
		super();
		this.tiquetesSinUsar = new java.util.ArrayList<Tiquete>();
		this.tiquetesUsados = new java.util.ArrayList<Tiquete>();
	}
	
	public abstract java.lang.String getTipoCliente();
	
	public abstract java.lang.String getIdentificador();
	
	public void agregarTiquete​(Tiquete tiquete) {
		tiquetesSinUsar.add(tiquete);
	}
	
	public int calcularValorTotalTiquetes() {
		int valorTotal = 0;
        for (Tiquete tiquete : tiquetesSinUsar) {
            valorTotal += tiquete.getTarifa();
        }
        return valorTotal;
	}
	
	public void usarTiquetes​(Vuelo vuelo) {
		for (Tiquete tiquete : tiquetesSinUsar) {
			if (tiquete.getVuelo().equals(vuelo)) {
				tiquetesUsados.add(tiquete);
			}
		}
	}
	
}
