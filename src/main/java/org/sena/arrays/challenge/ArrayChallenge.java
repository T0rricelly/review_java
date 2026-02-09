package org.sena.arrays.challenge;

import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int add = 0;
        System.out.println("Promedio de calififcaciones");
        System.out.println("Cuantas calificaciones desea ingresar");
        int amountArray = scanner.nextInt();
        int[] grades = new int[amountArray];
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Ingrese la calificacion");
            int amountGrades = scanner.nextInt();
            grades[i] = amountGrades;
            add += amountGrades;
        }
        System.out.println("El promedio de las calificaciones es: " + (add / grades.length));

    }
}
