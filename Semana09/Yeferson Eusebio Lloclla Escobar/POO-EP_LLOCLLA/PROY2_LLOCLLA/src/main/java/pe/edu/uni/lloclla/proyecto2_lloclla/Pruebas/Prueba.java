package pe.edu.uni.lloclla.proyecto2_lloclla.Pruebas;

import java.util.Arrays;
import pe.edu.uni.lloclla.proyecto2_lloclla.Service.Service;

public class Prueba {

	public static void main(String[] args) {
		int n = 5;
		Service servicio;
		servicio = new Service(n);

		// Variables
		int[] arreglo1 = servicio.getArreglo1();
		int[] arreglo2 = servicio.getArreglo2();
		int[] diferencia = servicio.arregloDiferencia();
		int[] interseccion = servicio.arregloInterseccion();

		// Reporte
		System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));
		System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));
		System.out.println("Arreglo Diferencia: " + Arrays.toString(diferencia));
		System.out.println("Arreglo Intersección: " + Arrays.toString(interseccion));
	}
}
