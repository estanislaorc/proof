package pe.gfi.proof;

import pe.gfi.service.impl.ProveedorServiceImpl;

public class Ejemplo {

	public static void main(String[] args) {
		Ejemplo ej=new Ejemplo();
		ej.enviar();

	}
	
	public void enviar() {
		ProveedorServiceImpl ps=new ProveedorServiceImpl();
		ps.enviarSaldo();
	}

}
