package pe.gfi.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import pe.gfi.entidad.Cartera;
import pe.gfi.entidad.Estructura;
import pe.gfi.entidad.FileToFTP;
import pe.gfi.entidad.Host;
import pe.gfi.entidad.Saldo;
import pe.gfi.service.ProveedorService;
import pe.gfi.util.Util;

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
	
	@Override
	public int enviarCartera() {
		List<Cartera> carteraList =obtenerCarteras();
		List<Estructura> estructFileCartera=Util.obtenerEstructura("estructuraCartera.json");
		
		File file;
		
		try {
			System.out.println("Enviando");
			file= Util.genenarContenido(carteraList, estructFileCartera, "fileCartera");
			Host host=new Host("ftp.dlptest.com",21,"dlpuser@dlptest.com","SzMf7rTE4pCrf9dV286GuNe4N");
				
			List<FileToFTP> fileToFTPList =new ArrayList<FileToFTP>();
			FileToFTP fileToFTP=new FileToFTP(file,"/ejemploCartera.txt");
			
			fileToFTPList.add(fileToFTP);
			
			
			Util.enviarToFTP(host, fileToFTPList);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return 1;
	}
	
	
	
	public List<Cartera> obtenerCarteras(){
		List<Cartera> carteraList=new ArrayList<Cartera>();
		Cartera cartera1=new Cartera("DOCHAMIISA","JUR","202001",
				"01","0136","D",
				"2521","0477935","93",
				null,"ADRIANA MARITZA","HERNANDEZ",
				"VASQUEZ","01",
				"22301682898","27/05/1995","25",
				"8298685282","","8298685282",
				"201918","her@gmail.es","SANTO DOMINGO",
				"STO DGO ESTE","STO DGO ESTE","",
				"CAL. CALLE LA FUENTE #24 LOS 3 BRAZOS","PREGUNTAR POR PAMELA AL LADO DEL CO JALA AIRE","11/12/2019",
				"11/12/2019","13/05/2020","16/07/2020",
				"154","2753852","7118.0",
				".0","7118.0",".0",
				"7118.0","0","No Gestionada",
				"Nom : ROSA  VÁZQUEZ   Tele : --8093881669/	Nom : AZALEA   HERNANDEZ  Tele : --8492707524/","","",
				"",""
				);
		
		Cartera cartera2=new Cartera("DOCHAMIISA","JUR","202001",
				"01","0140","C",
				"607","0466129","56",
				"","HILARIS ROCIO","LOPEZ",
				"CALCAÑO","01",
				"40241328703","15/07/1999","21",
				"8094864381","","8094864381",
				"201913","shantalperalta43@gmail.con","D.N.",
				"CIUDAD NUEVA","CIUDAD NUEVA","",
				"CAL. C LAS MERCEDES ESQ.MERILO","FRENTE A EL HOTEL","02/01/2020",
				"17/01/2020","13/05/2020","16/07/2020",
				"132","13276","5074.4",
				"1031.2","4043.2",".0",
				"4043.2","0","No Gestionada",
				"Nom : WENDY  GOMEZ  Tele : --8298183286/","Nom : JUNIOR  PEREZ  Tele : --8296330153/","",
				"",""
				);

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
