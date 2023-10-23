package pe.edu.uni.lloclla.proyecto2_lloclla.Service;

import java.util.Arrays;
import java.util.Random;

public class Service {

	private int[] arreglo1;
	private int[] arreglo2;

	public Service(int n) {
		// Variables: Inicialización de los arreglos
		arreglo1 = generarArregloAleatorio(n);
		arreglo2 = generarArregloAleatorio(n);
	}

	// Método privado para generar un arreglo aleatorio de tamaño n
	private int[] generarArregloAleatorio(int n) {
		// Variables: Declaración e inicialización de variables locales
		int[] arreglo = new int[n];
		Random random = new Random();
		// Proceso: Llenar el arreglo con números aleatorios en el rango [21, 30]
		for (int i = 0; i < n; i++) {
			arreglo[i] = random.nextInt(10) + 21;
		}
		// Reporte: Retornar el arreglo generado
		return arreglo;
	}

	public int[] getArreglo1() {
		// Reporte: Retornar el primer arreglo
		return arreglo1;
	}

	public int[] getArreglo2() {
		// Reporte: Retornar el segundo arreglo
		return arreglo2;
	}

	// Método para calcular la diferencia entre los arreglos
	public int[] arregloDiferencia() {
		// Variables: Declaración e inicialización de variables locales
		int[] diferencia = new int[arreglo1.length];
		int index = 0;

		// Proceso: Calcular la diferencia entre los arreglos
		for (int num : arreglo1) {
			if (!contiene(arreglo2, num) && !contiene(diferencia, num)) {
				diferencia[index] = num;
				index++;
			}
		}

		// Reporte: Retornar el arreglo de diferencia
		return Arrays.copyOf(diferencia, index);
	}

	// Método para calcular la intersección entre los arreglos
	public int[] arregloInterseccion() {
		// Variables: Declaración e inicialización de variables locales
		int[] interseccion = new int[arreglo1.length];
		int index = 0;

		// Proceso: Calcular la intersección entre los arreglos
		for (int num : arreglo1) {
			if (contiene(arreglo2, num) && !contiene(interseccion, num)) {
				interseccion[index] = num;
				index++;
			}
		}

		// Reporte: Retornar el arreglo de intersección
		return Arrays.copyOf(interseccion, index);
	}

	// Método para verificar si un elemento existe en un arreglo
	private boolean contiene(int[] arreglo, int elemento) {
		// Proceso: Verificar si el elemento existe en el arreglo
		for (int num : arreglo) {
			if (num == elemento) {
				return true;
			}
		}

		// Reporte: Retornar verdadero si el elemento se encuentra en el arreglo, de lo contrario, falso
		return false;
	}
}
