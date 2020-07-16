package pe.gfi.entidad;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {

	private int idPagina;
	private String nombrePagina;
	private String nombreComponente;
	private String uri;
	private String nombreIcono;
	private Integer idPagPadre;
	private int idModulo;
	private int flagMaestro;
	private String componenteAngular;
	private List<Menu> subItem;
	private String icon;
	
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	private String codIpress;

	public String getCodIpress() {
		return codIpress;
	}

	public void setCodIpress(String codIpress) {
		this.codIpress = codIpress;
	}

	public Integer getIdPagPadre() {
		return idPagPadre;
	}

	public void setIdPagPadre(Integer idPagPadre) {
		this.idPagPadre = idPagPadre;
	}

	public String getComponenteAngular() {
		return componenteAngular;
	}

	public void setComponenteAngular(String componenteAngular) {
		this.componenteAngular = componenteAngular;
	}

	public int getFlagMaestro() {
		return flagMaestro;
	}

	public void setFlagMaestro(int flagMaestro) {
		this.flagMaestro = flagMaestro;
	}

	public int getIdPagina() {
		return idPagina;
	}

	public void setIdPagina(int idPagina) {
		this.idPagina = idPagina;
	}

	public String getNombrePagina() {
		return nombrePagina;
	}

	public void setNombrePagina(String nombrePagina) {
		this.nombrePagina = nombrePagina;
	}

	public String getNombreComponente() {
		return nombreComponente;
	}

	public void setNombreComponente(String nombreComponente) {
		this.nombreComponente = nombreComponente;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getNombreIcono() {
		return nombreIcono;
	}

	public void setNombreIcono(String nombreIcono) {
		this.nombreIcono = nombreIcono;
	}

	public int getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}

	public List<Menu> getSubItem() {
		return subItem;
	}

	public void setSubItem(List<Menu> subItem) {
		this.subItem = subItem;
	}
}