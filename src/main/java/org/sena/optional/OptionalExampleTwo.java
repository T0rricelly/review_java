package org.sena.optional;

import java.util.Optional;

public class OptionalExampleTwo {
    public static void main(String[] args) {

//         Ejemplo 1
//         ofNullable(): Puede devolver un null o un valor
        Optional<String> optionalNull = Optional.ofNullable(null);
        if (optionalNull.isEmpty()) System.out.println("El valor es vacio");
        if (optionalNull == null ) System.out.println("El valor es null");

        // Ejemplo 2

        // of(): Debe devolver un valor y no permite un null
        Optional<String> string = Optional.of("hola");

        if(string.isEmpty()) {
            System.out.println("El valor es vacio");
        }else {
            System.out.println("Tiene un valor " + string);
        }

        Optional<String> stringNull = Optional.empty();
        if (stringNull.isEmpty()){
            System.out.println("El valor es vacio");
        }else{
            System.out.println("Tiene un valor " + stringNull);
        }
    }
}
