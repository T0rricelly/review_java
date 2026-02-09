package org.sena.matrices;

public class Matriz {
    public static void main(String[] args) {
        final int ROWS = 2;
        final int COLUMN = 3;
//        int[][] matriz = new int[ROWS][COLUMN];
//        matriz[0][0] = 100;
//        matriz[0][1] = 200;
//        matriz[0][2] = 300;
//        matriz[1][0] = 400;
//        matriz[1][1] = 500;
//        matriz[1][2] = 600;

        // Simplificated Version
        int[][] matriz = new int[][]{
                {100,200,300},
                {400,500,600}
        };
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMN; col++){
                System.out.println("Valor [" + row + "][" + col + "] = " + matriz[row][col]);
            }
        }
    }
}
