package com.example.Arrays.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un el valor del articulo para sumar el Iva:");
        int numero = scanner.nextInt();
        double iva = numero * 0.21;
        double total = numero + iva;
        System.out.println("El valor total con iva es: $" + total);
    }
}
