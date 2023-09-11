package pe.edu.uni.aprendiendojava.prueba;

import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		while(true)
			System.out.println(random.nextInt(10));
		
	}

}
