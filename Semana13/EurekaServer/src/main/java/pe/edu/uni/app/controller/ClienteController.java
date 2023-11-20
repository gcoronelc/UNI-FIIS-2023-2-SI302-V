package pe.edu.uni.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.uni.app.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public List<Map<String, Object>> getAll() {
		return clienteService.getAll();
	}

	@GetMapping("/{dato}")
	public List<Map<String, Object>> getAll(@PathVariable String dato) {
		return clienteService.getAll(dato);
	}
	
	@GetMapping("/datos")
	public List<Map<String, Object>> getAll(@RequestBody Map<String,String> parametros) {
		String paterno = parametros.get("paterno");
		String materno = parametros.get("materno");
		String nombre = parametros.get("nombre");
		return clienteService.getAll(paterno, materno, nombre);
	}
	

}
