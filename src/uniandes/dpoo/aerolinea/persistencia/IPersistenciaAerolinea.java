package uniandes.dpoo.aerolinea.persistencia;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public class IPersistenciaAerolinea {
	
	void cargarAerolinea​(java.lang.String archivo, Aerolinea aerolinea)
			throws java.io.IOException, InformacionInconsistenteException {
		IPersistenciaAerolinea cargador = CentralPersistencia.getPersistenciaAerolinea(archivo);
		cargador.cargarAerolinea​(archivo, aerolinea);
	}

	void salvarAerolinea​(java.lang.String archivo, Aerolinea aerolinea) throws java.io.IOException {
		IPersistenciaAerolinea salvador = CentralPersistencia.getPersistenciaAerolinea(archivo);
		salvador.salvarAerolinea​(archivo, aerolinea);
	}

}
d