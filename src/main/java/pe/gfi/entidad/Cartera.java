package pe.gfi.entidad;

public class Cartera {

	private String NombreApellidos;
	private String direccion;
	private String codigo;
	public String getNombreApellidos() {
		return NombreApellidos;
	}
	public void setNombreApellidos(String nombreApellidos) {
		NombreApellidos = nombreApellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
