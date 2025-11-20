package org.sena.option;
import java.util.Optional;

public class option {
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
     }

}
