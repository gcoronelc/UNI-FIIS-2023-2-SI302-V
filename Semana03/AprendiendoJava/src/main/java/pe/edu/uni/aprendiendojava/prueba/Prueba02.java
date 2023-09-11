package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.model.PersonaModel;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		
		System.out.println(new PersonaModel("Gustavo"));
		
		for(int i=1; i<=100;i++){
			System.out.println(new PersonaModel("Persona " + i));
		}
		
		System.out.println(new PersonaModel("Sergio"));
		
	}

}
