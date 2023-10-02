package pe.edu.uni.aprendiendojava.modelo;

/**
 *
 * @author Gustavo Coronel
 */
public class Rectangulo implements Figura{

	private int base;
	private int altura;

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base*altura;
	}
	
}
