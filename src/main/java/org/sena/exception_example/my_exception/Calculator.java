package org.sena.exception_example.my_exception;

public class Calculator {
    public int division(int divider, int dividend) throws DividedException{
        if (divider == 0) throw new DividedException("No se puede dividir por cero");
        int result = divider / dividend;
        return result;
    }
}
