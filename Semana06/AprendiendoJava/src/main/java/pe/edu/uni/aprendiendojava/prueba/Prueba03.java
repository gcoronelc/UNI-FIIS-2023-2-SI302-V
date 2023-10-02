package pe.edu.uni.aprendiendojava.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.edu.uni.aprendiendojava.modelo.Cuadrado;
import pe.edu.uni.aprendiendojava.modelo.Figura;
import pe.edu.uni.aprendiendojava.modelo.Rectangulo;

/**
 *
 * @author Gustavo Coronel
 * @blog http://desarrollasoftware.com/
 * @cursos https://gcoronelc.github.io/
 */
public class Prueba03 {
	
	private static double calArea(Figura bean){
		return bean.calcularArea();
	}

    public static void main(String[] args) {
		 
		 System.out.println("Area 1: " + calArea(new Cuadrado(7)));
		 System.out.println("Area 2: " + calArea(new Rectangulo(7,5)));
	 }

}
