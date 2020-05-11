package pe.gfi.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import pe.gfi.entidad.Estructura;

public class Util {
	public static File genenarContenido(List<?> lista,List<Estructura> estructuraList, String nombreArchivo) throws IOException {
		String cadena = "";
		
		for(Object x : lista) {
			String valor;
				valor = "";
				for(Estructura estructura: estructuraList) {
					try {  valor ="0";
							Field field = x.getClass().getDeclaredField(estructura.getCampo());
							field.setAccessible(true);
							//valor = transformarValor(field.get(x).toString(),estructura.getLonguitud());
							if(field.get(x)!=null) {
								valor = field.get(x).toString();
							}
							if(estructura.getOrden() == maximoOrden(estructuraList)) {
								cadena+=valor;
							}
							else {
								cadena+=valor+"|";
							}
							
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


}
