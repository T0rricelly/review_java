package org.sena.time_challenge;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Clock {
    Scanner sc = new Scanner(System.in);
    // Calcular grados por horario - minutero
    public void hourToMinutes() {
        System.out.println("Ingrese las horas");
        int hour = sc.nextInt();
        System.out.println("Ingrese los minutos");
        int minutes = sc.nextInt();
        if (hour > 12) hour -= 12;
        if (hour == 12) hour = 0;
        int gradesPerMinute = 6;
        int gradesPerHour = 30;
        int hourGrades = gradesPerHour * hour;
        int minuteGrades = gradesPerMinute * minutes;
        System.out.println("Los grados son " + (minuteGrades - hourGrades));
    }
    // Calcular grados minutero-segundero
    public void minutesToSeconds(){
        System.out.println("Ingrese los minutos");
        int minutes = sc.nextInt();
        System.out.println("Ingrese los segundos");
        int seconds = sc.nextInt();
        int gradesPerMinute = 6;
        int gradesPerSeconds = 6;
        int secondsGrades = gradesPerSeconds * seconds;
        int minuteGrades = abs(gradesPerMinute * minutes);
        System.out.println("Los grados son " + (secondsGrades - minuteGrades));
    }
    // Calcular grados horario-segundero
    public void hourToSeconds(){
        System.out.println("Ingrese las horas");
        int hour = sc.nextInt();
        System.out.println("Ingrese los segundos");
        int seconds = sc.nextInt();
        if (hour > 12) hour -= 12;
        if (hour == 12) hour = 0;
        int gradesPerSecond = 6;
        int gradesPerHour = 30;
        int hourGrades = gradesPerHour * hour;
        int secondGrades = gradesPerSecond * seconds;
        int grades = abs(secondGrades - hourGrades);
         System.out.println("Los grados de desplazamiento son " + grades + "grados");
    }
    public void selecOption(int opcion){
        switch  (opcion){
            case 1:
                hourToMinutes();
                break;
            case 2:
                minutesToSeconds();
                break;
            case 3:
                hourToSeconds();
                break;
        }
    }


}
