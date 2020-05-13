package pe.gfi.entidad;

import java.io.File;

public class FileToFTP {
	
	public File file;
	public String pathFileFTP;
	
	public FileToFTP(File file, String pathFileFTP) {
		this.file=file;
		this.pathFileFTP=pathFileFTP;
	}
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getPathFileFTP() {
		return pathFileFTP;
	}
	public void setPathFileFTP(String pathFileFTP) {
		this.pathFileFTP = pathFileFTP;
	}
	
	
}
