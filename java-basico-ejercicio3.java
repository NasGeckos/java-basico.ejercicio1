package com.example.Arrays;

public class ArrayMain {

    public static void main(String[] args){

        String[] nombres2 = new String[]{ nombre1, nombre2, nombre3 };

        String concatenador = " ";
        for(int i=0; i < nombres2.length; i++){
            concatenador += nombres2[i] + ", ";
        }
      
        System.out.println(concatenador);

    }
}
