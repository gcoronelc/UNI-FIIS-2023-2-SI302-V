package pe.edu.uni.proyectosemana07.prueba;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba04 {

	public static void main(String[] args) {

		try {
			// Datos
			int n1 = 90;
			int n2 = 0;
			// Validar datos
			if (n2 == 0) {
				throw new Exception("No es posible didivir por cero.");
			}
			// Proceso
			int n3 = n1 / n2;
			// Reporte
			System.out.println("n3 = " + n3);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		} finally{
			System.out.println("Bien, esto es todo.");
		}

	}

}
