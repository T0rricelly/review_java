package org.sena.streams;


import java.util.ArrayList;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.stream()
                .filter(n -> n <= 3)
                .forEach(n -> System.out.println(n));
    }
}
