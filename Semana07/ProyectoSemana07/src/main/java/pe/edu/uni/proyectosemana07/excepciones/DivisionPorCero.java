package pe.edu.uni.proyectosemana07.excepciones;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class DivisionPorCero extends RuntimeException{

	public DivisionPorCero() {
		super("NO es posible vidivir entre cero.");
	}
	
	public DivisionPorCero(String mensaje) {
		super(mensaje);
	}
	

}
