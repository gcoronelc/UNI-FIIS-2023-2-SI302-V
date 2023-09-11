package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.MateService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		MateService service = new MateService();
		
		System.out.println("Suma 1: " + service.sumar(5, 7));
		System.out.println("Suma 2: " + service.sumar(5.0, 7));
	}

}
