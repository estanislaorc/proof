package pe.gfi.entidad;

public class Cartera {

	private String cobrador;
	private String etapa;
	private String campana;
	private String region;
	private String zona;
	private String seccion;
	private String terr;
	private String codigo;
	private String digitoCtrl;
	private String programaReconocimiento;
	private String nombres;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String tipoDocumIdent;
	private String numDocumIdent;
	private String fechaNacimiento;
	private String edad;
	private String telf1;
	private String telf2;
	private String movil;
	private String primerPedido;
	private String correoElectronico;
	private String departamento;
	private String provincia;
	private String distrito;
	private String urbanizacion;
	private String direccion;
	private String referencia;
	private String fechaDocumento;
	private String FechaVencto;
	private String fechaAsignacion;
	private String fechaCierre;
	private String diasAtraso;
	private String identificadorCargo;
	private String importeDeudaOriginal;
	private String importeAbonosAnteriores;
	private String importeDeudaAsignada;
	private String importeDeudaRecuperada;
	private String importeDeudaPendiente;
	private String porcRecup;
	private String ultimaGestion;
	private String referFami;
	private String referNoFam;
	private String referAval;
	private String referObser;
	private String diasPromedioDeuda;
	
	public Cartera(String cobrador,String etapa, String campana,
			String region,String zona,String seccion,
			String terr,String codigo,String digitoCtrl,String programaReconocimiento,String nombres,
			String apellidoPaterno,String apellidoMaterno,String tipoDocumIdent,String numDocumIdent,String fechaNacimiento,String edad,
			String telf1, String telf2, String movil, String primerPedido, String correoElectronico, String departamento,
			String provincia, String distrito, String urbanizacion, String direccion, String referencia, String fechaDocumento, String FechaVencto,
			String fechaAsignacion, String fechaCierre, String diasAtraso, String identificadorCargo, String importeDeudaOriginal,String importeAbonosAnteriores,String importeDeudaAsignada,
			String importeDeudaRecuperada,String importeDeudaPendiente,String porcRecup,String ultimaGestion, String referFami,String referNoFam,String referAval,String referObser,String diasPromedioDeuda)
		{
			this.cobrador=cobrador;
			this.etapa=etapa;
			this.campana=campana;
			this.region=region;
			this.zona=zona;
			this.seccion=seccion;
			this.terr=terr;
			this.codigo=codigo;
			this.digitoCtrl=digitoCtrl;
			this.programaReconocimiento=programaReconocimiento;
			this.nombres=nombres;
			this.apellidoPaterno=apellidoPaterno;
			this.apellidoMaterno=apellidoMaterno;
			this.tipoDocumIdent=tipoDocumIdent;
			this.numDocumIdent=numDocumIdent;
			this.fechaNacimiento=fechaNacimiento;
			this.edad=edad;
			this.telf1=telf1;
			this.telf2=telf2;
			this.movil=movil;
			this.primerPedido=primerPedido;
			this.correoElectronico=correoElectronico;
			this.departamento=departamento;
			this.provincia=provincia;
			this.distrito=distrito;
			this.urbanizacion=urbanizacion;
			this.direccion=direccion;
			this.referencia=referencia;
			this.fechaDocumento=fechaDocumento;
			this.FechaVencto=FechaVencto;
			this.fechaAsignacion=fechaAsignacion;
			this.fechaCierre=fechaCierre;
			this.diasAtraso=diasAtraso;
			this.identificadorCargo=identificadorCargo;
			this.importeDeudaOriginal=importeDeudaOriginal;
			this.importeAbonosAnteriores=importeAbonosAnteriores;
			this.importeDeudaAsignada=importeDeudaAsignada;
			this.importeDeudaRecuperada=importeDeudaRecuperada;
			this.importeDeudaPendiente=importeDeudaPendiente;
			this.porcRecup=porcRecup;
			this.ultimaGestion=ultimaGestion;
			this.referFami=referFami;
			this.referNoFam=referNoFam;
			this.referAval=referAval;
			this.referObser=referObser;
			this.diasPromedioDeuda=diasPromedioDeuda;
	}
	
	public String getCobrador() {
		return cobrador;
	}
	public void setCobrador(String cobrador) {
		this.cobrador = cobrador;
	}
	public String getEtapa() {
		return etapa;
	}
	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}
	public String getCampana() {
		return campana;
	}
	public void setCampana(String campana) {
		this.campana = campana;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getTerr() {
		return terr;
	}
	public void setTerr(String terr) {
		this.terr = terr;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDigitoCtrl() {
		return digitoCtrl;
	}
	public void setDigitoCtrl(String digitoCtrl) {
		this.digitoCtrl = digitoCtrl;
	}
	public String getProgramaReconocimiento() {
		return programaReconocimiento;
	}
	public void setProgramaReconocimiento(String programaReconocimiento) {
		this.programaReconocimiento = programaReconocimiento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getTipoDocumIdent() {
		return tipoDocumIdent;
	}
	public void setTipoDocumIdent(String tipoDocumIdent) {
		this.tipoDocumIdent = tipoDocumIdent;
	}
	public String getNumDocumIdent() {
		return numDocumIdent;
	}
	public void setNumDocumIdent(String numDocumIdent) {
		this.numDocumIdent = numDocumIdent;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getTelf1() {
		return telf1;
	}
	public void setTelf1(String telf1) {
		this.telf1 = telf1;
	}
	public String getTelf2() {
		return telf2;
	}
	public void setTelf2(String telf2) {
		this.telf2 = telf2;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getPrimerPedido() {
		return primerPedido;
	}
	public void setPrimerPedido(String primerPedido) {
		this.primerPedido = primerPedido;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getUrbanizacion() {
		return urbanizacion;
	}
	public void setUrbanizacion(String urbanizacion) {
		this.urbanizacion = urbanizacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDirección(String direccion) {
		this.direccion = direccion;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getFechaDocumento() {
		return fechaDocumento;
	}
	public void setFechaDocumento(String fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}
	public String getFechaVencto() {
		return FechaVencto;
	}
	public void setFechaVencto(String fechaVencto) {
		FechaVencto = fechaVencto;
	}
	public String getFechaAsignacion() {
		return fechaAsignacion;
	}
	public void setFechaAsignación(String fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}
	public String getFechaCierre() {
		return fechaCierre;
	}
	public void setFechaCierre(String fechaCierre) {
		this.fechaCierre = fechaCierre;
	}
	public String getDiasAtraso() {
		return diasAtraso;
	}
	public void setDiasAtraso(String diasAtraso) {
		this.diasAtraso = diasAtraso;
	}
	public String getIdentificadorCargo() {
		return identificadorCargo;
	}
	public void setIdentificadorCargo(String identificadorCargo) {
		this.identificadorCargo = identificadorCargo;
	}
	public String getImporteDeudaOriginal() {
		return importeDeudaOriginal;
	}
	public void setImporteDeudaOriginal(String importeDeudaOriginal) {
		this.importeDeudaOriginal = importeDeudaOriginal;
	}
	public String getImporteAbonosAnteriores() {
		return importeAbonosAnteriores;
	}
	public void setImporteAbonosAnteriores(String importeAbonosAnteriores) {
		this.importeAbonosAnteriores = importeAbonosAnteriores;
	}
	public String getImporteDeudaAsignada() {
		return importeDeudaAsignada;
	}
	public void setImporteDeudaAsignada(String importeDeudaAsignada) {
		this.importeDeudaAsignada = importeDeudaAsignada;
	}
	public String getImporteDeudaRecuperada() {
		return importeDeudaRecuperada;
	}
	public void setImporteDeudaRecuperada(String importeDeudaRecuperada) {
		this.importeDeudaRecuperada = importeDeudaRecuperada;
	}
	public String getImporteDeudaPendiente() {
		return importeDeudaPendiente;
	}
	public void setImporteDeudaPendiente(String importeDeudaPendiente) {
		this.importeDeudaPendiente = importeDeudaPendiente;
	}
	public String getPorcRecup() {
		return porcRecup;
	}
	public void setPorcRecup(String porcRecup) {
		this.porcRecup = porcRecup;
	}
	public String getUltimaGestion() {
		return ultimaGestion;
	}
	public void setUltimaGestion(String ultimaGestion) {
		this.ultimaGestion = ultimaGestion;
	}
	public String getReferFami() {
		return referFami;
	}
	public void setReferFami(String referFami) {
		this.referFami = referFami;
	}
	public String getReferNoFam() {
		return referNoFam;
	}
	public void setReferNoFam(String referNoFam) {
		this.referNoFam = referNoFam;
	}
	public String getReferAval() {
		return referAval;
	}
	public void setReferAval(String referAval) {
		this.referAval = referAval;
	}
	public String getReferObser() {
		return referObser;
	}
	public void setReferObser(String referObser) {
		this.referObser = referObser;
	}
	public String getDiasPromedioDeuda() {
		return diasPromedioDeuda;
	}
	public void setDiasPromedioDeuda(String diasPromedioDeuda) {
		this.diasPromedioDeuda = diasPromedioDeuda;
	}
	
	

	
	
}
