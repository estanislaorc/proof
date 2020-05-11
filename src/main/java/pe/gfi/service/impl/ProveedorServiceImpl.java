package pe.gfi.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.gfi.entidad.Cartera;
import pe.gfi.entidad.Estructura;
import pe.gfi.service.ProveedorService;
import pe.gfi.util.Util;

@Service("proveedorService")
public class ProveedorServiceImpl implements ProveedorService {

	@Override
	public int enviarCartera() {
		
		List<Cartera> carteraList =obtenerCarteras();
		
		List<Estructura> estructFileCartera=definirEstructuraCartera();
		
		File file;
		
		try {
			file= Util.genenarContenido(carteraList, estructFileCartera, "fileCartera");
		    // enviarToFileServer(file,FTP);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return 1;
	}
	
	public List<Cartera> obtenerCarteras(){
		List<Cartera> carteraList=new ArrayList<Cartera>();
		Cartera cartera1=new Cartera();
		cartera1.setNombreApellidos("Juan Perez Kia");
		cartera1.setDireccion("Jr. Los Alpes 345");
		cartera1.setCodigo("62370");
		
		Cartera cartera2=new Cartera();
		cartera2.setNombreApellidos("Luis Torres");
		cartera2.setDireccion("Av. Los Pinos 346");
		cartera2.setCodigo("98433");
		
		carteraList.add(cartera1);
		carteraList.add(cartera2);
		
		return carteraList;
	}
	
	public List<Estructura> definirEstructuraCartera(){
		List<Estructura> estructFileCartera=new ArrayList<Estructura>();
		Estructura estructCartera1=new Estructura("nombreApellidos",1,50);
		Estructura estructCartera2=new Estructura("direccion",1,50);
		Estructura estructCartera3=new Estructura("codigo",1,50);
		estructFileCartera.add(estructCartera1);
		estructFileCartera.add(estructCartera2);
		estructFileCartera.add(estructCartera3);
		
		return estructFileCartera;
	}

}
