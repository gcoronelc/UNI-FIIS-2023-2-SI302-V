package pe.edu.uni.proyecto1_espinoza.ep.pruebas;

import pe.edu.uni.proyecto1_espinoza.ep.service.Operaciones;

public class PruebaSerie {

	public static void main(String[] args) {
		System.out.println("\ti\tserie");
		for (int i = 1; i <= 5; i++) {
			System.out.println("\t" + i + "\t" + Operaciones.sumaserie(i));
		}
	}
}
