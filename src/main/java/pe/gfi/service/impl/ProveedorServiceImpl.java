package pe.gfi.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.google.gson.GsonBuilder;

import pe.gfi.entidad.Cartera;
import pe.gfi.entidad.Estructura;
import pe.gfi.entidad.FileToFTP;
import pe.gfi.entidad.Host;
import pe.gfi.entidad.Saldo;
import pe.gfi.service.ProveedorService;
import pe.gfi.util.Util;
import java.nio.file.Files;

public class ProveedorServiceImpl implements ProveedorService {

	@Override
	public int enviarSaldo() {
		
		List<Saldo> saldoList =obtenerSaldos();
		List<Estructura> estructFileCartera=Util.obtenerEstructura("estructuraSaldo.json");
		
		File file;
		
		try {
			System.out.println("Enviando");
			file= Util.genenarContenido(saldoList, estructFileCartera, "fileSaldo");
			Host host=new Host("ftp.dlptest.com",21,"dlpuser@dlptest.com","SzMf7rTE4pCrf9dV286GuNe4N");
				
			List<FileToFTP> fileToFTPList =new ArrayList<FileToFTP>();
			FileToFTP fileToFTP=new FileToFTP(file,"/ejemploSaldo.txt");
			
			fileToFTPList.add(fileToFTP);
			
			
			Util.enviarToFTP(host, fileToFTPList);
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
	
	public List<Saldo> obtenerSaldos(){
		List<Saldo> saldosList=new ArrayList<Saldo>();
		
		Saldo saldo1=new Saldo("782388292","8923828282","12/04/2020",new Double(490.00),"300.00","05/04/2020",null,null,"deuda1");
		Saldo saldo2=new Saldo("782388293","8923828283","15/04/2020",new Double(800.00),"500.00","01/04/2020",null,null,"deuda2");
		saldosList.add(saldo1);
		saldosList.add(saldo2);
		return saldosList;
		
	}
	
	

}
