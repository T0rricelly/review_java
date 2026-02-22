package org.sena.exception_example.my_exception;

public class App {
    public static void main(String[] args)  {
        try {
            int numberOne = 0;
            int numberTwo = 10;
            int result;
            Calculator calculator = new Calculator();
            result = calculator.division(numberOne, numberTwo);
            System.out.println(result);
        } catch (DividedException e) {
            System.out.println(e.getMessage());
        }

    }
}
