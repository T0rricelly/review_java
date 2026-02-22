package org.sena.exercise_poo;

public class InvalidIbcException extends Exception{
    // Herededamos el message de Exception, para que al construir el objeto pueda tener un mensaje personalizado
    public InvalidIbcException(String message) {
        super(message);
    }
}
