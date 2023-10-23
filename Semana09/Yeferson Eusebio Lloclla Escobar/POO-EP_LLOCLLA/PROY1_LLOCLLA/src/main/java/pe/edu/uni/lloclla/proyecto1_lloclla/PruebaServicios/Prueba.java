/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.lloclla.proyecto1_lloclla.PruebaServicios;

import pe.edu.uni.lloclla.proyecto1_lloclla.service.Service;

/**
 *
 * @author Yeferson
 */
public class Prueba {

    public static void main(String[] args) {
        Service matematicos = new Service();

        // Prueba para verificar si un número es de Armstrong
        int numeroArmstrong = 371;
        int numeroNoArmstrong = 123;

        // Variables
        boolean esArmstrong1 = matematicos.esNumeroArmstrong(numeroArmstrong);
        boolean esArmstrong2 = matematicos.esNumeroArmstrong(numeroNoArmstrong);

        // Reporte
        System.out.println(numeroArmstrong + " es un número de Armstrong: " + esArmstrong1);
        System.out.println(numeroNoArmstrong + " es un número de Armstrong: " + esArmstrong2);

        // Prueba para calcular la suma de la serie
        int n = 5;
        
        // Variables
        double sumaSerie = matematicos.calcularSumaSerie(n);

        // Reporte
        System.out.println("La suma de la serie para n=" + n + " es: " + sumaSerie);

        // Prueba para encontrar los primeros n números de Fibonacci
        int nFibonacci = 8;
        
        // Variables
        String numerosFibonacci = matematicos.encontrarNumerosFibonacci(nFibonacci);

        // Reporte
        System.out.println("Los primeros " + nFibonacci + " números de Fibonacci son:");
        System.out.print(numerosFibonacci);
    }
}




