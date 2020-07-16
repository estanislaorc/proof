package pe.gfi.util;

import java.util.ArrayList;
import java.util.List;

import pe.gfi.entidad.Menu;

public class MenuUtil {
	public List<Menu> procesarData(List<Menu> data) {
		List<Menu> opcionList = data;
		List<Menu> opcionRelacionadoList = new ArrayList<Menu>();
		for (Menu opcion : opcionList) {
			if (opcion.getIdPagPadre() == 0) {
				Menu encontrado = null;
				encontrado = buscarOpcionHijo(data, opcion.getIdPagina(), opcion);
				opcionRelacionadoList.add(encontrado);
			}
		}

		return opcionRelacionadoList;

	}

	public Menu buscarOpcionHijo(List<Menu> data, Integer idOpcionPadre, Menu opcionPadre) {
		List<Menu> opcionList = data;

		for (Menu opcion : opcionList) {
			if (opcion.getIdPagPadre() != 0) {
				// System.out.println("Es "+opcion.getIdOpcionPadre()+" == "+idOpcionPadre+"
				// ?");
				if (opcion.getIdPagPadre() != 0 && idOpcionPadre != 0) {
					if (opcion.getIdPagPadre().equals(idOpcionPadre)) {

						if (opcionPadre.getSubItem() == null) {
							opcionPadre.setSubItem(new ArrayList<Menu>());
						}
						opcionPadre.getSubItem().add(opcion);
						// System.out.println("El padre "+opcionPadre.getIdOpcion()+" ha agregado al
						// hijo" + opcion.getIdOpcion());
						if (opcion != null) {
							buscarOpcionHijo(data, opcion.getIdPagina(), opcion);
						}

					}
				}
			}
		}

		return opcionPadre;
	}

}
