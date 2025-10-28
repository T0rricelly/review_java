package org.sena.arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
    Crea un array de numeros y obten el mayor y el menor de array
 */
public class Ejercicio2Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Ingrese un numero");
            numbers[i] = sc.nextInt();
            if (numbers[i] < number && numbers[i] < menor) {
                number = numbers[i];
                menor = number;
            } else if (numbers[i] > number && numbers[i] > mayor) {
                number = numbers[i];
                mayor = number;
            }
        }
        System.out.println("El numero menor es " + menor);
        System.out.println("El numero mayor es " + mayor);
    }
}
