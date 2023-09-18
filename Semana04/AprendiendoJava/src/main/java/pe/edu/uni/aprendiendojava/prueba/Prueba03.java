package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.PromedioServiceSpec;
import pe.edu.uni.aprendiendojava.service.sistb.PromedioServiceImpl;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		PromedioServiceSpec service = new PromedioServiceImpl();
		System.out.println("Promedio: " + service.promediar(15, 8, 12));
	}

}
