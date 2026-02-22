package org.sena.exception_example;


public class Exceptions {
    public static void main(String[] args) {

        try {
            int valueOne = 10;
            int valueTwo = 0;
            int result = valueOne / valueTwo;
            System.out.println("Resultado " + result);
        }catch(Exception e){
            System.out.println("No se puede dividir por cero");
        }

    }
}
