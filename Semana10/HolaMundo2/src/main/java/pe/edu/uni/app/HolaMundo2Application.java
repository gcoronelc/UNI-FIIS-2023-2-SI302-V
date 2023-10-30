package pe.edu.uni.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HolaMundo2Application {

	public static void main(String[] args) {
		SpringApplication.run(HolaMundo2Application.class, args);
	}

	@GetMapping
	public String holaTodos() {
		return "Hola todos";
	}
}
