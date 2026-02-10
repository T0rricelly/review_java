package org.sena.oop.test_example;

import org.sena.oop.class_example.Person;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos persona");
        Person object1 = new Person("Santiago", "Torres");
//        object1.showPerson();
        System.out.println(object1);
        System.out.println(object1.getName());
        System.out.println(object1.getLast_name());
    }
}
