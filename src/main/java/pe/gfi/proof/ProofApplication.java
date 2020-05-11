package pe.gfi.proof;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.gfi.service.ProveedorService;

@SpringBootApplication
public class ProofApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ProofApplication.class, args);
		
	}

}
