package org.sena.time_challenge;

public class Clock {
    public void calculatedGrades(int hour, int minutes){
        int gradesPerMinute = 6;
        int gradesPerHour = 30;
        int hourGrades = gradesPerHour * hour;
        int minuteGrades = gradesPerMinute * minutes;
        System.out.println("Los grados son " + (minuteGrades - hourGrades));
    }

}
