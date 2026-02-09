package org.sena.time_challenge;

public class Clock {
    private int hours = 12;
    private int minutes = 60;

    int [][] clock = new int [hours][minutes];

    public void showClock(){
        for (int h = 0; h < hours; h++){
            System.out.println();
            for (int m = 0; m < minutes; m++){
                clock[h][m] = m + 1;
                System.out.print(clock[h][m] + " ");
            }
        }
    }
    public void calculatedGrades(int hour, int minutes){
        int gradesPerMinute = 6;
        System.out.println(minutes * gradesPerMinute - (hour * gradesPerMinute)/ 360);
    }

}
