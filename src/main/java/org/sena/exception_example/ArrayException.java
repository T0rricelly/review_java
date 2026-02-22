package org.sena.exception_example;

public class ArrayException {
    public static void main(String[] args) {
        try {
            int[] ages = {15, 12, 23, 30};
            System.out.println("La edad de la posicion 4 es " + ages[4]);
        } catch (Exception e) {
            System.out.println("Intentaste acceder a un indice que no existe");
        }
    }

}
