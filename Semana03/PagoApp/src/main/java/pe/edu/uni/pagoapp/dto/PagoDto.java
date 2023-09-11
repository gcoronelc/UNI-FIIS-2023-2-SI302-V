package pe.edu.uni.pagoapp.dto;

import lombok.Data;

/**
 *
 * @author Gustavo Coronel
 */
@Data
public class PagoDto {
	
	// Datos
	private int horasDia;
	private int dias;
	private double pagoHora;
	// Reporte
	private double ingresos;
	private double renta;
	private double sueldoNeto;

	/**
	 * Constructor por defecto.
	 */
	public PagoDto() {
	}

	/**
	 * Constructor adicional
	 * @param horasDia Las horas diarias trabajadas.
	 * @param dias Los dias trabajados.
	 * @param pagoHora El pago por hora trabajada.
	 */
	public PagoDto(int horasDia, int dias, double pagoHora) {
		this.horasDia = horasDia;
		this.dias = dias;
		this.pagoHora = pagoHora;
	}

	
}
