package org.sena.oop.test_example;

import org.sena.oop.class_example.Person;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos persona");
        Person objeto1 = new Person("Santiago", "Torres");
        objeto1.showPerson();
        System.out.println(objeto1.getName());
        System.out.println(objeto1.getLast_name());
    }
}
