package pe.gfi.entidad;

public class Saldo {

	private String codigoCliente;
	private String idCargo;
	private String fechaCierre;
	private Double importeDeudaRecuperada;
	private String importeDeudaPendiente;
	private String fechaPago;
	private String campo1;
	private String campo2;
	private String descripcionEtapaDeuda;
	private String importeDeudaRecuperadaString;
	
	public Saldo(String codigoCliente,String idCargo,String fechaCierre,Double importeDeudaRecuperada,String importeDeudaPendiente,String fechaPago,String campo1,String campo2,String descripcionEtapaDeuda) {
		this.codigoCliente=codigoCliente;
		this.idCargo=idCargo;
		this.fechaCierre=fechaCierre;
		this.importeDeudaRecuperada=importeDeudaRecuperada;
		this.importeDeudaPendiente=importeDeudaPendiente;
		this.fechaPago=fechaPago;
		this.campo1=campo1;
		this.campo2=campo2;
		this.descripcionEtapaDeuda=descripcionEtapaDeuda;
	}
	
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(String idCargo) {
		this.idCargo = idCargo;
	}
	public String getFechaCierre() {
		return fechaCierre;
	}
	public void setFechaCierre(String fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	
	public String getImporteDeudaPendiente() {
		return importeDeudaPendiente;
	}
	public void setImporteDeudaPendiente(String importeDeudaPendiente) {
		this.importeDeudaPendiente = importeDeudaPendiente;
	}
	public String getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(String fechaPago) {
		this.fechaPago = fechaPago;
	}
	public String getCampo1() {
		return campo1;
	}
	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}
	public String getCampo2() {
		return campo2;
	}
	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}
	public String getDescripcionEtapaDeuda() {
		return descripcionEtapaDeuda;
	}
	public void setDescripcionEtapaDeuda(String descripcionEtapaDeuda) {
		this.descripcionEtapaDeuda = descripcionEtapaDeuda;
	}

	public Double getImporteDeudaRecuperada() {
		return importeDeudaRecuperada;
	}

	public void setImporteDeudaRecuperada(Double importeDeudaRecuperada) {
		this.importeDeudaRecuperada = importeDeudaRecuperada;
		
	}

	public String getImporteDeudaRecuperadaString() {
		return importeDeudaRecuperadaString;
	}

	public void setImporteDeudaRecuperadaString(String importeDeudaRecuperadaString) {
		this.importeDeudaRecuperadaString = importeDeudaRecuperadaString;
	}
	
	
	
}
