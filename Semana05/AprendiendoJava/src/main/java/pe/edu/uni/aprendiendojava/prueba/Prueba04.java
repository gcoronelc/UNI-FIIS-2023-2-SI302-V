package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.herencia.Clase1;
import pe.edu.uni.aprendiendojava.herencia.Clase2;
import pe.edu.uni.aprendiendojava.herencia.Clase3;
import pe.edu.uni.aprendiendojava.herencia.Clase4;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

	public static void main(String[] args) {
		Clase2 bean = new Clase3();

		if (bean instanceof Object) {
			Object o = bean;
			System.out.println("bean es compatible con Object.");
		}
		if (bean instanceof Clase1) {
			Clase1 o = bean;
			System.out.println("bean es compatible con Clase1.");
		}
		if (bean instanceof Clase2) {
			Clase2 o = bean;
			System.out.println("bean es compatible con Clase2.");
		}
		if (bean instanceof Clase3) {
			Clase3 o = (Clase3) bean;
			System.out.println("bean es compatible con Clase3.");
		}
		if (bean instanceof Clase4) {
			Clase4 o = (Clase4) bean;
			System.out.println("bean es compatible con Clase4.");
		}
	}

}
