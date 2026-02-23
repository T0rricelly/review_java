package org.sena.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Lunes");
        myList.add("Martes");
        myList.add("Miercoles");
        myList.add("Jueves");
        myList.add("Viernes");
        myList.add("Sabado");
        myList.add("Domingo");
//        for (String i : myList){
//            System.out.println(i);
//        }

        // Funcion Lambda (Funcion anonima)
//        myList.forEach(i -> { System.out.println(i); });
        myList.forEach(System.out::println);


        System.out.println();
        List<String> names = Arrays.asList("Pedro", "Jose");
        for (String name : names){
            System.out.println(name);
        }
    }
}
