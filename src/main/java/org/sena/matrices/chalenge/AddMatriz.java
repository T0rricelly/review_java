package org.sena.matrices.chalenge;

public class AddMatriz {
    public static void main(String[] args) {
        final int ROWS = 3;
        final int COLUMN = 3;
        int add = 0;
        int[][] matriz = new int [][] {
                {100,200,300},
                {400,500,600},
                {700,800,900}
        };
        for (int row = 0; row < ROWS; row++){
            System.out.println();
            for (int col = 0; col < COLUMN; col++){
                System.out.print(matriz[row][col] + " ");
                if (row == col)
                    add += matriz[row][col];
            }
        }
        System.out.println("\n" + "La suma diagonal es " + add);
    }
}
