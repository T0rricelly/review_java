package org.sena.time_challenge;

import static java.lang.Math.abs;

public class Clock {
    // Calcular grados por horario - minutero
    public void hourToMinutes(int hour, int minutes) {
        int gradesPerMinute = 6;
        int gradesPerHour = 30;
        int hourGrades = gradesPerHour * hour;
        int minuteGrades = gradesPerMinute * minutes;
        System.out.println("Los grados son " + (minuteGrades - hourGrades));
    }
    // Calcular grados minutero-segundero
    public void minutesToSeconds(int minutes, int seconds){
        int gradesPerMinute = 6;
        int gradesPerHour = 30;
        int hourGrades = gradesPerHour * seconds;
        int minuteGrades = gradesPerMinute * minutes;
        System.out.println("Los grados son " + (minuteGrades - hourGrades));
    }
    // Calcular grados horario-segundero
    public void hourToSeconds(int hour, int seconds){
        if (hour == 12){
            hour = 0;
        }
        int gradesPerSecond = 6;
        int gradesPerHour = 30;
        int hourGrades = gradesPerHour * hour;
        int secondGrades = gradesPerSecond * seconds;
        int grades = abs(secondGrades - hourGrades);
         System.out.println("Los grados de desplazamiento son " + grades + "grados");
    }
//    public void selecOption(int opcion, int hour, int minutes, int seconds){
//        switch  (opcion){
//            case 1:
//                hourToMinutes(hour,minutes);
//            case 2:
//                minutesToSeconds(minutes, seconds);
//            case 3:
//                hourToSeconds(hour, seconds);
//        }
//    }


}
