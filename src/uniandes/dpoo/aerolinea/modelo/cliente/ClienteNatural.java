package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural {
	
	public static final java.lang.String NATURAL = "Natural";
	private java.lang.String nombre;
	
	public ClienteNatural(java.lang.String nombre) {
		super();
		this.nombre = nombre;
	}

	public java.lang.String getIdentificador(){
		return nombre;
    }
		
	public java.lang.String getTipoCliente() {
		return NATURAL;
	}
	
	
}
