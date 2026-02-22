package org.sena.exception_example.manual;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        int y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese y: ");
        y = sc.nextInt();
        z = new Calculator().Factor(y);
        System.out.println("Resultado " + z);
        System.out.println("Adios");
    }
}
