package pe.edu.uni.pagoapp.service;

import pe.edu.uni.pagoapp.dto.PagoDto;

/**
 *
 * @author Gustavo Coronel
 */
public class PagoService {
	
	public PagoDto procesarSueldo(PagoDto dto){
		// Proceso
		double ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
		double renta = ingresos * (ingresos>1500.0?0.08:0.0);
		double sueldoNeto = ingresos - renta;
		// Reporte
		dto.setIngresos(ingresos);
		dto.setRenta(renta);
		dto.setSueldoNeto(sueldoNeto);
		return dto;
	}

}
