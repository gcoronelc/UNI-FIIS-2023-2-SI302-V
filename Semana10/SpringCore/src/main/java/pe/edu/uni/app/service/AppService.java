package pe.edu.uni.app.service;

import org.springframework.stereotype.Service;

import pe.edu.uni.app.dto.VentaDto;

@Service
public class AppService {

	public int sumar(int n1, int n2) {
		return (n1 + n2);
	}
	
	public VentaDto calcVenta(VentaDto dto) {
		// Calcular
		double total = dto.getPrecio() * dto.getCantidad();
		double importe = total / 1.18;
		double impuesto = total - importe;
		// Reporte
		dto.setImporte(importe);
		dto.setImpuesto(impuesto);
		dto.setTotal(total);
		return dto;
	}

}
