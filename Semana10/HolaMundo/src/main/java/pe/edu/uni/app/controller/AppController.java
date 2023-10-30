package pe.edu.uni.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping({"","/","/hola"})
	public String holaMundo() {
		return "Hola mundo";
	}

}
