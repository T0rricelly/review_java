package org.sena.arrays;

import com.sun.security.jgss.GSSUtil;

public class Array {
    public static void main(String[] args) {

    // Crear un Array
    int[] array1 = new int[10];
    // int[] array = { 10, 20, 30, 40, 50 }


    /*
    Se pueden asignar manualmente
    array1[0] = 10;
    array1[1] = 20;
    array1[2] = 30;
    array1[3] = 40;
    array1[4] = 50;
     */
     for (int i = 0; i < array1.length; i++){
         array1[i] = (i + 1) * 7;
     }

     //Recorrer el arreglo por forEach
    for (int i : array1){
        System.out.println(i);
    }
    }
}
