package org.sena.collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<>();
        maps.put("nombre", "Diego");
        maps.put("apellido", "Flores");
        maps.put("edad", "31");
        System.out.println("Valores");
        maps.entrySet().forEach(System.out::println);
        System.out.println(maps.get("nombre"));
        maps.remove("edad");
        System.out.println("Nuevos elementos");
        maps.forEach((k, v) -> System.out.println(k + v));
    }
}
