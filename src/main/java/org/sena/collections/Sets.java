package org.sena.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Santiago");
        set.add("Maria");
//        set.add("Maria");
        for (String name: set) {
            System.out.println(name);
        }
        set.remove("Maria");
        System.out.println("ultimos elementos");
        set.forEach(i -> System.out.println(i));
    }
}
