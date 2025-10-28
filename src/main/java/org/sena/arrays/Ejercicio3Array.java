package org.sena.arrays;
import java.util.Scanner;
/*
    Dado 2 arrays uno con nombres de personas y otro con sus edades, indique cual es la persona con mas edad
 */
public class Ejercicio3Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        int[] ages = new int[3];
        String oldName = "";
        int oldAge = 0;

        for (int i = 0; i < names.length; i++){
            System.out.println("Ingrese un nombre");
            names[i] = sc.next();
            System.out.println("Ingrese una edad");
            ages[i] = sc.nextInt();
            if (ages[i] > oldAge ){
                oldAge = ages[i];
                oldName = names[i];
            }
        }
        System.out.println("La persona con mas edad es " + oldName + " y tiene " + oldAge + " años");
    }
}
