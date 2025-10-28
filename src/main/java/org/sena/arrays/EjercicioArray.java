package org.sena.arrays;

import java.util.Scanner;

public class EjercicioArray {
    /*
    Crea un array de numeros y obten la suma y la media de sus elementos
     */
    public static void main(String[] args) {
        int result = 0;
        int numberUser = 0;
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un numero:");
            numberUser = sc.nextInt();
            array[i] = numberUser;
            result = result + numberUser;
        }
        int med = result / array.length;
        System.out.println("La suma es " + result + " y la media es: " + med);
    }
}
