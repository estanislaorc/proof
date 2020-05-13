package pe.gfi.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.util.ResourceUtils;

import com.google.gson.GsonBuilder;

import pe.gfi.entidad.Confirmacion;
import pe.gfi.entidad.Estructura;
import pe.gfi.entidad.FileToFTP;
import pe.gfi.entidad.Host;

public class Util {
	public static File genenarContenido(List<?> lista,List<Estructura> estructuraList, String nombreArchivo) throws IOException {
		String cadena = "";
		
		for(Object obj : lista) {
			String valor;
				valor = "";
				for(Estructura estructura: estructuraList) {
					try {  valor ="";
							Field field = obj.getClass().getDeclaredField(estructura.getCampo());
							field.setAccessible(true);
							if(field.get(obj)!=null) {
								valor = transformarValor(field.get(obj).toString(),estructura.getLonguitud());
							}
							
							cadena+=valor;
							
							
						} catch (Exception e) {
							e.printStackTrace();
						}
				}
				cadena+=System.lineSeparator();
				
			}
			File file = new File(nombreArchivo);
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(cadena);
			fileWriter.flush();
			fileWriter.close();
		return file;
	  }
	
	public static int maximoOrden(List<Estructura> estructuraList) {
		int max = 0;
		for(Estructura estruct : estructuraList) {
			if(estruct.getOrden() > max) {
				max = estruct.getOrden();
			}
		}
		return max;
	}
	
	public static String transformarValor(String valor, int longuitud) {
		String nuevoValor=valor;
		int totalCaracteres = valor.length();
		if(totalCaracteres < longuitud) {
			int caracteresPorCompletar = longuitud - totalCaracteres;
			for(int i = 0; i < caracteresPorCompletar; i++) {
				nuevoValor += " ";
			}
		}
		if(totalCaracteres == longuitud) {
			//
		}
		if(totalCaracteres > longuitud){
			nuevoValor = nuevoValor.substring(0, longuitud);
		}
		return nuevoValor;
	}

	public static Confirmacion enviarToFTP(Host host, List<FileToFTP> fileToFTPList) {
		Confirmacion confirmacion=new Confirmacion();
		FTPClient ftpClient = new FTPClient();
        try {
 
            ftpClient.connect(host.getIp(), host.getPort());
            ftpClient.login(host.getUser(), host.getPass());
            ftpClient.enterLocalPassiveMode();
 
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            for(FileToFTP fileToFTP:fileToFTPList) {
            	
	            InputStream inputStream = new FileInputStream(fileToFTP.getFile());
	            System.out.println("Start uploading file");
	            boolean done = ftpClient.storeFile(fileToFTP.getPathFileFTP(), inputStream);
	            
	            if (done) {
	                System.out.println("Archivo enviado al ftp correctamente");
	                confirmacion.setEstado(true);
		            confirmacion.setMensaje("Archivo enviado al ftp correctamente");
	            }
	            inputStream.close();
	            
	 
	           
            }
 
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
            confirmacion.setEstado(false);
            confirmacion.setMensaje("Error al enviar al ftp");
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
		
		
		
		return confirmacion;
	}

	public static List<Estructura> obtenerEstructura(String nombrefileEstructuraJson){
		List<Estructura> estructFileCartera=new ArrayList<Estructura>();
		String jsonString="";
		try {
			File file = ResourceUtils.getFile("classpath:"+nombrefileEstructuraJson);
			System.out.println("File Found : " + file.exists());
			jsonString = new String(Files.readAllBytes(file.toPath()));
			
			System.out.println(jsonString);
		}
		catch(Exception ex) {
			
		}
		
		estructFileCartera = Arrays.asList(new GsonBuilder().create().fromJson(jsonString, Estructura[].class));
		
		return estructFileCartera;
	}
}
