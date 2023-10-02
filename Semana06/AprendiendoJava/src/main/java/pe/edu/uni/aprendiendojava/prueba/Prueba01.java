package pe.edu.uni.aprendiendojava.prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @blog http://desarrollasoftware.com/
 * @cursos https://gcoronelc.github.io/
 */
public class Prueba01 {

    public static void main(String[] args) {
		 
		 List lista = new ArrayList(); // Lista generica, tipo Object
		 
		 lista.add(5678);
		 lista.add("Gustavo");
		 lista.add(5678.86);
		 lista.add(9898.45f);
		 
		 System.out.println("Tamanio: " + lista.size());
		 
		 for (Object bean : lista) {
			 System.out.println(bean.toString());
		 }
	 }

}
