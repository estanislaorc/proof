package pe.gfi.proof;

import pe.gfi.entidad.ConfirmacionLecturaFTP;
import pe.gfi.entidad.Host;
import pe.gfi.service.impl.ProveedorServiceImpl;
import pe.gfi.util.Util;

public class Ejemplo {

	public static void main(String[] args) {
		Ejemplo ej=new Ejemplo();
		ej.obtenerFileFromFTP();

	}
	
	public void enviar() {
		ProveedorServiceImpl ps=new ProveedorServiceImpl();
		//ps.enviarSaldo();
		//ps.enviarCartera();
	}
	
	public void obtenerFileFromFTP() {
		Host host=new Host("ftp.dlptest.com",21,"dlpuser@dlptest.com","SzMf7rTE4pCrf9dV286GuNe4N");
		String pathFileFTP="/Volcado2020.05.06.xlsx";
		ConfirmacionLecturaFTP confirmacion=Util.obtenerFile(host, pathFileFTP);
		System.out.println(confirmacion.getFileBase64());
		
	}

}
