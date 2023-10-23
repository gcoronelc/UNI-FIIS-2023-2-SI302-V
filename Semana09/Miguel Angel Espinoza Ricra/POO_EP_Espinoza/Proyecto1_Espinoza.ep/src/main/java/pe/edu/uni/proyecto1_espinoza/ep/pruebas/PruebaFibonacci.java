package pe.edu.uni.proyecto1_espinoza.ep.pruebas;

import pe.edu.uni.proyecto1_espinoza.ep.service.Operaciones;

public class PruebaFibonacci {

	public static void main(String[] args) {
		System.out.println("\ti\tfinonacci");
		for(int i=1; i<=5;i++){
			System.out.println("\t" + i + "\t" + Operaciones.fibonacci(i));
		}
	}
}
