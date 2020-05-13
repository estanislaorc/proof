package pe.gfi.entidad;

public class Host {
	String ip;
    int port;
    String user;
    String pass;
    
    public Host(String ip,int port,String user,String pass) {
    	this.ip=ip;
    	this.port=port;
    	this.user=user;
    	this.pass=pass;
    }
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

    
}
