package pe.edu.uni.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.uni.app.dto.VentaDto;
import pe.edu.uni.app.service.AppService;

@RestController
public class AppController {

	@Autowired
	private AppService appService;

	@GetMapping("suma")
	public String sumar(int n1, int n2) {
		int suma = appService.sumar(n1, n2);
		return "Suma: " + suma;
	}
	
	@PostMapping("venta1")
	public VentaDto calcVenta1(double precio, int cantidad) {
		VentaDto dto = new VentaDto(precio, cantidad);
		return appService.calcVenta(dto);
	}
	
	@PostMapping("venta2")
	public VentaDto calcVenta2(VentaDto dto) {
		return appService.calcVenta(dto);
	}
	
	@PostMapping("venta3")
	public VentaDto calcVenta3(@RequestBody VentaDto dto) {
		return appService.calcVenta(dto);
	}

}
