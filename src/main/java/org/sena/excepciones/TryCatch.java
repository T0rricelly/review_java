package org.sena.excepciones;

public class TryCatch {
    public static void main(String[] args) {
        // AritmeticException
        try{
            int division = 10 / 0;
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por 0");
        }
    }
}
