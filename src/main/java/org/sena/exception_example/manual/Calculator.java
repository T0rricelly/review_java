package org.sena.exception_example.manual;

public class Calculator {
    public int Factor (int number){
        if (number < 0){
            throw new ArithmeticException("No se puede calcular el factorial de un numero negativo");
        }
        if (number > 12){
            throw new IntegerOverflowException("El dato ingresado no es valido");
        }

        int fact = 1;
        for (int i = 2; i <= number; i++){
            fact *= i;
        }
        return  fact;
    }
}
