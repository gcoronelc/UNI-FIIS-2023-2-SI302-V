/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proyecto2_espinoza.ep.service;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Grabi
 */
public class ArregloService {
    int[] arreglo1;
    int[] arreglo2;
    
    public int[] ArregloService(int n) {
        Random random = new Random();
        int[] arreglo = new int[n];
        for(int i=0; i<n; i++){
            arreglo[i] = random.nextInt(10) + 21;
        }
        return arreglo;
    }
    
    public int[] getArreglo1(int[] arreglo1){
        return arreglo1;
    }

    public int[] getArreglo2(int[] arreglo2){
        return arreglo2;
    }
     
    public int[] arregloDiferencia(int[]  arreglo1, int[] arreglo2) {
        ArrayList<Integer> diferencia=new ArrayList<>();
        for(int elemento:arreglo1){
            if(!contiene(arreglo2, elemento) && !diferencia.contains(elemento)) {
                diferencia.add(elemento);
            }
        }
        return diferencia.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] arregloInterseccion(int[]  arreglo1, int[] arreglo2) {
        ArrayList<Integer> interseccion = new ArrayList<>();
        for (int elemento:arreglo1) {
            if (contiene(arreglo2, elemento) && !interseccion.contains(elemento)) {
                interseccion.add(elemento);
            }
        }
        return interseccion.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean contiene(int[] arreglo, int elemento) {
        for(int valor:arreglo) {
            if (valor==elemento) {
                return true;
            }
        }
        return false;
    }
    
    public String imprimirarreglo(int[] arreglo) {
        StringBuilder resultado = new StringBuilder();
        for (int i=0; i<arreglo.length; i++) {
            resultado.append(arreglo[i]);
            if (i<arreglo.length-1) {
                resultado.append(" ");
            }
        }
        return resultado.toString();
    }
}

