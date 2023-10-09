package pe.edu.uni.proyectosemana07.service;

import javax.swing.JOptionPane;
import pe.edu.uni.proyectosemana07.excepciones.DivisionPorCero;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class MateService {

	public int dividir(int n1, int n2) throws Exception {
		// Variables
		int rpta = 0;
		// Proceso
		if (n2 == 0) {
			throw new Exception("N0 se puede dividir entre cero.");
		}
		rpta = n1 / n2;
		// Reporte
		return rpta;
	}
	
	public int dividir2(int n1, int n2) {
		// Variables
		int rpta;
		// Proceso
		if (n2 == 0) {
			throw new RuntimeException("N0 se puede dividir entre cero.");
		}
		rpta = n1 / n2;
		// Reporte
		return rpta;
	}
	public int dividir3(int n1, int n2) {
		// Variables
		int rpta;
		// Proceso
		if (n2 == 0) {
			throw new DivisionPorCero();
		}
		rpta = n1 / n2;
		// Reporte
		return rpta;
	}

}
