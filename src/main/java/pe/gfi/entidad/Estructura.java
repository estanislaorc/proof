package pe.gfi.entidad;

public class Estructura {
	
		private String campo;
		private int orden;
		private int longuitud;
		private boolean isFecha;
		
		public Estructura(String campo,int orden,int longuitud) {
			this.campo=campo;
			this.orden=orden;
			this.longuitud=longuitud;
		}
		
		public String getCampo() {
			return campo;
		}
		public void setCampo(String campo) {
			this.campo = campo;
		}
		public int getOrden() {
			return orden;
		}
		public void setOrden(int orden) {
			this.orden = orden;
		}
		public int getLonguitud() {
			return longuitud;
		}
		public void setLonguitud(int longuitud) {
			this.longuitud = longuitud;
		}

}
