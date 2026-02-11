package org.sena.time_challenge;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clock clock = new Clock();
//        System.out.println("Ingrese una opcion");
//        int option = sc.nextInt();
        System.out.println("Ingrese las horas");
        int hour = sc.nextInt();
//        System.out.println("Ingrese los minutos");
//        int minutes = sc.nextInt();
        System.out.println("Ingrese los segundos");
        int seconds = sc.nextInt();
//        clock.selecOption(option,hour,minutes,seconds);
        clock.hourToSeconds(hour, seconds);

        sc.close();
    }
}
