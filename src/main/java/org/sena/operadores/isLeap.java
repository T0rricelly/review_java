package org.sena.operadores;

import java.util.Scanner;

public class isLeap {
    public static void main(String[] args) {

    /*
        Pide un año por teclado e indica si es biciesto o no
     */
        // Un año es biciesto cuando es divisible por 400
        System.out.println("Ingrese un año");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Es biciesto");
        } else {
            System.out.println("No es biciesto");
        }
    }
}
