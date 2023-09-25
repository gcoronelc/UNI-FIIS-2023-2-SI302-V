package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.herencia.Clase1;
import pe.edu.uni.aprendiendojava.herencia.Clase2;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		Clase1 o = new Clase2();
		Clase2 x = (Clase2) o;
		System.out.println("9 + 7 = " + x.sumar(9, 7));
		
	}
	
}
