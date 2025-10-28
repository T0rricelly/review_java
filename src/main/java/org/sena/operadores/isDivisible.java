package org.sena.operadores;

import java.util.Scanner;
/*
    Pide 2 numeros por teclado e indica si el segundo es divisible por el primero
    Por ejemplo, el numero = 10 y  el numero = 5 deberia mostrar "El numero 5 es divisible de 10"
*/
public class isDivisible {
    public static void main(String[] args) {
        // ✔️   Ingreso de numeros
        System.out.println("Ingrese el primer numero");
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numberTwo = sc.nextInt();
        // Validacion de datos
        if (numberOne % numberTwo == 0 ){
            System.out.println("El numero " + numberTwo + " es divisible de " + numberOne);
        }else {
            System.out.println("El numero " + numberTwo + " no es divisible de " + numberOne);

        }


    }
}
