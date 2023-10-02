package pe.edu.uni.aprendiendojava.modelo;

/**
 *
 * @author Gustavo Coronel
 */
public class Cuadrado implements Figura {

	private int lado;

	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	

	@Override
	public double calcularArea() {
		return lado * lado;
	}

}
