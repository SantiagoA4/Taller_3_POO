package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    // TODO completar

	private java.lang.String  horaSalida;
	private java.lang.String horaLlegada;
	private java.lang.String codigoRuta;
	private Aeropuerto destino;
	private Aeropuerto origen;
	
	
	public Ruta(Aeropuerto origen, Aeropuerto destino, java.lang.String horaSalida, java.lang.String horaLlegada, java.lang.String codigoRuta) {
		super();
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
		this.destino = destino;
		this.origen = origen;
	}
	
	public java.lang.String getCodigoRuta(){
		return codigoRuta;
	}
	
	public Aeropuerto getOrigen() {
		return origen;
	}
	
	public Aeropuerto getDestino() {
		return destino;
	}
	
	public java.lang.String getHoraSalida(){
		return horaSalida;
	}
	
	public java.lang.String getHoraLlegada(){
		return horaLlegada;
	}

	public int getDuracion() {
		int horaSalida = getHoras(this.horaSalida);
		int horaLlegada = getHoras(this.horaLlegada);
		int minutosSalida = getMinutos(this.horaSalida);
		int minutosLlegada = getMinutos(this.horaLlegada);
		int duracion = (horaLlegada - horaSalida) * 60 + (minutosLlegada - minutosSalida);
		return duracion;
	}
	
	
    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
