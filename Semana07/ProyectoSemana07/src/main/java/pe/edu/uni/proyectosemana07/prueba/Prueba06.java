package pe.edu.uni.proyectosemana07.prueba;

import pe.edu.uni.proyectosemana07.service.MateService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba06 {

	public static void main(String[] args) {

		try {
			// Datos
			int n1 = 90;
			int n2 = 0;
			// Proceso
			MateService service = new MateService();
			int n3 = service.dividir2(n1, n2);
			// Reporte
			System.out.println("n3 = " + n3);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
