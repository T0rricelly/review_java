package org.sena.time_challenge;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clock clock = new Clock();
        System.out.println("Bienvenido");
        System.out.println("1. Horario - minutero\n2. Minutero - segundero\n3. Horario - segundero");
        System.out.println("Ingrese una opcion");
        int option = sc.nextInt();
        clock.selecOption(option);


        sc.close();
    }
}
