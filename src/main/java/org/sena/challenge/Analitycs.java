package org.sena.challenge;

public class Analitycs {
    int[][] matchPoints = new int[][]{
            {22, 15, 20, 30,3},
            {30, 25, 19, 40},
            {29, 19, 27, 38}
    };

    public void calculateMatchPoints() {
        for (int match = 0; match < 3; match++) {
            int addPoints = 0;
            for (int quarter = 0; quarter < matchPoints[match].length; quarter++) {
                addPoints += matchPoints[match][quarter];
            }
            System.out.println("El total de puntos en el partido " + (match + 1) + " es " + addPoints);
        }
    }

}
