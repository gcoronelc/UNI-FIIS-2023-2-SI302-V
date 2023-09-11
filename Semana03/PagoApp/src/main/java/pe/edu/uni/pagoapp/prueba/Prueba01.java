package pe.edu.uni.pagoapp.prueba;

import pe.edu.uni.pagoapp.dto.PagoDto;
import pe.edu.uni.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		// Datos
		PagoDto dto = new PagoDto(5, 20, 130.0);
		// Proceso
		PagoService pagoService = new PagoService();
		dto = pagoService.procesarSueldo(dto);
		// Reporte
		System.out.println("Ingresos: " + dto.getIngresos());
		System.out.println("Renta: " + dto.getRenta());
		System.out.println("Sueldo neto: " + dto.getSueldoNeto());
	}

}
