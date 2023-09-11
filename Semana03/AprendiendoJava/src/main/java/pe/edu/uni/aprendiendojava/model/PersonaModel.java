package pe.edu.uni.aprendiendojava.model;

/**
 *
 * @author Gustavo Coronel
 */
public class PersonaModel {

	private static int contador;
	private int codigo;
	private String nombre;

	static {
		contador = 0;
	}

	public PersonaModel() {
	}

	public PersonaModel(String nombre) {
		this.codigo = ++contador;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		String texto = "[" + codigo + ", " + nombre + "]";
		return texto;
	}

}
