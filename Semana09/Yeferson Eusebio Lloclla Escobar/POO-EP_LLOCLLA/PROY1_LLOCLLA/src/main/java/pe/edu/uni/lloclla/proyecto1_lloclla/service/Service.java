/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.lloclla.proyecto1_lloclla.service;

/**
 *
 * @author Yeferson
 */
public class Service {

    // Método para comprobar si un número es un número de Armstrong
    public static boolean esNumeroArmstrong(int numero) {
        int numeroOriginal = numero;
        int numeroDeCifras = String.valueOf(numero).length();
        int suma = 0;

        // Proceso
        while (numero > 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, numeroDeCifras);
            numero /= 10;
        }

        // Reporte
        return suma == numeroOriginal;
    }

    // Método para calcular la suma de la serie 1 + 1/2 + 1/3 + ... + 1/n
    public static double calcularSumaSerie(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número debe ser positivo.");
        }

        // Variables
        double suma = 0;

        // Proceso
        for (int i = 1; i <= n; i++) {
            suma += 1.0 / i;
        }

        // Reporte
        return suma;
    }

    // Método para encontrar los primeros "n" números de Fibonacci
    public static String encontrarNumerosFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("El número debe ser positivo.");
        }

        // Variables
        StringBuilder resultado = new StringBuilder();
        int[] numerosFibonacci = new int[n];
        numerosFibonacci[0] = 0;
        resultado.append("0");

        // Proceso
        if (n > 1) {
            numerosFibonacci[1] = 1;
            resultado.append(", 1");

            for (int i = 2; i < n; i++) {
                numerosFibonacci[i] = numerosFibonacci[i - 1] + numerosFibonacci[i - 2];
                resultado.append(", " + numerosFibonacci[i]);
            }
        }

        // Reporte
        return resultado.toString();
    }
}


