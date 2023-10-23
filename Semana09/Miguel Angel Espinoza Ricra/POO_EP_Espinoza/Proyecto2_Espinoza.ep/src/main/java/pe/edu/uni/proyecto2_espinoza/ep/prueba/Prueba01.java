/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyecto2_espinoza.ep.prueba;

import pe.edu.uni.proyecto2_espinoza.ep.service.ArregloService;

/**
 *
 * @author Grabi
 */
public class Prueba01 {
    public static void main(String[] args) {
        ArregloService ar = new ArregloService();
        int[] arreglo1={1,2,4,3};
        int[] arreglo2={7,8,2,4};
        int[] arreglodif=ar.arregloDiferencia(arreglo1, arreglo2);
        int[] arreglointer=ar.arregloInterseccion(arreglo1, arreglo2);
        System.out.println("Arreglo 1: "+ar.imprimirarreglo(arreglo1));
        System.out.println("Arreglo 2: "+ar.imprimirarreglo(arreglo2));
        System.out.println("Arreglo diferencia: "+ar.imprimirarreglo(arreglodif));
        System.out.println("Arreglo intersección: "+ar.imprimirarreglo(arreglointer));
        
    }
}
