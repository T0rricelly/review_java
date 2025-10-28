package org.sena.doWhile;

import java.util.Scanner;

public class ejercicioDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Ingrese un numero positivo");
            number = sc.nextInt();
            if (number < 0){
                System.out.println("El numero ingresado no es positivo");
            }
        } while (number < 0);
        System.out.println("El numero " + number + " es positivo");
    }
}
