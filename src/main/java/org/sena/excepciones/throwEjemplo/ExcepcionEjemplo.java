package org.sena.excepciones.throwEjemplo;

public class ExcepcionEjemplo {
    // Se crea un exception personalizado
    public static void validateNumber(int number) throws Exception{
        if (number >= 0 && number <= 10) {
            throw new Exception("El numero no se encuentra en el rango estimado");
        }
    }
}
