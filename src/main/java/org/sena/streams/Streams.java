package org.sena.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana","Luis", "Maria", "Pedro", "Juan", "Carla");

        // filter(): Filtra los elementos que cumplen una condicion.
        System.out.println("---Filter---");
        names.stream()
                .filter((name) -> name.length() > 4 )
                .forEach((System.out::println));
        // mapToInt():Devuelve un intStream que tiene funciones propias
        // map(): Transforma los elementos aplicando una funcion.
        System.out.println("---Map---");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // sorted(): Ordena los elementos del stream.
        System.out.println("---Sorted---");
        names.stream()
                .sorted()
                .forEach(System.out::println);

        // forEach(): Aplica una accion a cada elemento
        System.out.println("---ForEach---");
        names.stream()
                .forEach((name) -> {
            // Consultas a bases de datos, etc.
        });

        // reduce(): Combina todos los elementos en un solo valor
        System.out.println("---Reduce---");
        String result = names.stream()
                .reduce( "Resultado",(a, b) -> a + " " + b);
        System.out.println(result);

        // collect(): Recoge los elementos en un coleccion
        System.out.println("---Collect---");
        names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
                //.toList();

        // distinc(): Elimina los elementos repetidos
        System.out.println("---Distinc---");
        names.stream()
                .distinct()
                .forEach(System.out::println);

        // limit():Limita el numero de elementos procesados
        System.out.println("---Limit---");
        names.stream()
                .limit(3)
                .forEach(System.out::println);

        // skip(): Omite un numero especifico de elementos
        System.out.println("---Skip---");
        names.stream()
                .skip(3)
                .forEach(System.out::println);

        // anyMatch(): Verifica si algun elemento cumple una condicion
        System.out.println("---AnyMatch---");
        boolean result1 = names.stream()
                .anyMatch((name) -> name.startsWith("J"));
        System.out.println(result1);

        // allMatch(): Verifica si todos los elementos cumplen una funcion
        System.out.println("---AllMatch---");
        boolean result2 = names.stream()
                .allMatch((name) -> name.startsWith("A"));
        System.out.println(result2);
        // noneMatch(): Verifica si ningun elemento cumplen una funcion
        System.out.println("---NoneMatch---");
        boolean result3 = names.stream()
                .noneMatch((name) -> name.length() == 10);
        System.out.println(result3);

    }
}
