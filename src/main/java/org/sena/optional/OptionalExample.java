package org.sena.optional;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional <String> stringNull = Optional.ofNullable(null);
        Optional <String> stringOptional = Optional.of("Hola");
        String messageNull = null;

        if (stringNull.isEmpty()){
            System.out.println("El valor de stringNull es nulo");
        }
        if (stringOptional.isEmpty()){
            System.out.println("El valor de stringOptional es vacio");
        }
        Optional<String> optionalNull = Optional.ofNullable(messageNull);
        String secureValue = optionalNull.orElse("Valor por defecto por que era nulo");
        System.out.println(secureValue);
        optionalNull.get();

        /*
            empty(): Crea un optional vacio
            of(valor): Crea un optional con un valor (Lanza una exepcion si es valor es null)
            ofNullable(valor): Crea un optional puede estar vacio si el valor es null
            isPresent(): Devuelve True si hay un valor
            isEmpty(): Devuelve true si no hay valor
            get(): Devuelve el valor (Lanza exepcion si esta vacio)
            orElse(): Devuelve el valor o uno por defecto
            orElseGet(Supplier): Igual que con orElse pero con una funcion
            orElseThrow(): Lanza noSuchELementException si no hay valor
        */

     }

}
