package pe.edu.uni.proyecto1_espinoza.ep.service;

import java.util.Arrays;

public class Operaciones {

	public static boolean numerodeamstrong(int numero) {
		int numeroOriginal = numero;
		int numeroDigitos = numerodedigitos(numero);
		int suma = 0;
		while (numero > 0) {
			int digito = numero % 10;
			suma += Math.pow(digito, numeroDigitos);
			numero /= 10;
		}
		return suma == numeroOriginal;
	}

	public static int numerodedigitos(int numero) {
		int contador = 0;
		while (numero != 0) {
			numero /= 10;
			contador++;
		}
		return contador;
	}

	public static double sumaserie(int n) {
		double suma = 0.0;
		for (int i = 1; i <= n; i++) {
			suma += 1.0 / i;
		}
		return suma;
	}

	public static String fibonacci(int n) {
		long[] fibonacciserie = new long[n];
		if (n >= 1) {
			fibonacciserie[0] = 0;
		}
		if (n >= 2) {
			fibonacciserie[1] = 1;
		}

		for (int i = 2; i < n; i++) {
			fibonacciserie[i] = fibonacciserie[i - 1] + fibonacciserie[i - 2];
		}
		return Arrays.toString(fibonacciserie);
	}

}
