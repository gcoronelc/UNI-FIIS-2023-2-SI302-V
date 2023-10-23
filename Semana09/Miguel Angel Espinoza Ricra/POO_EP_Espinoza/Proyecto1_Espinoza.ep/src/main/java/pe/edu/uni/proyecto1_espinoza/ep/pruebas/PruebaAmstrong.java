package pe.edu.uni.proyecto1_espinoza.ep.pruebas;

import pe.edu.uni.proyecto1_espinoza.ep.service.Operaciones;

public class PruebaAmstrong {

	public static void main(String[] args) {
		System.out.println("PRUEBA DE AMSTRONG");
		System.out.println("371: " + Operaciones.numerodeamstrong(371));
		System.out.println("6578: " + Operaciones.numerodeamstrong(6789));
		System.out.println("1: " + Operaciones.numerodeamstrong(1));
	}
}
