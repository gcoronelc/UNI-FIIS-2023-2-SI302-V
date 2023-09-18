package pe.edu.uni.aprendiendojava.herencia;

/**
 *
 * @author Gustavo Coronel
 */
public class Clase2 extends Clase1 {

	public Clase2() {
		
		super("Gustavo");
	}
	
	
	

	@Override
	public int sumar(int n1, int n2) {
		int suma = super.sumar(n1, n2) * (n1 - n2);
		return suma;
	}

}
