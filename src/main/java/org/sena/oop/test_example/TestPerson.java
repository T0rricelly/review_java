package org.sena.oop.test_example;

import org.sena.oop.class_example.Person;

public class TestPerson {
    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos persona");
        Person object1 = new Person("Santiago", "Torres");
        System.out.println(object1);
        System.out.println(Person.getCountPerson());
        Person object2 = new Person("Santiago", "Torres");
        System.out.println(object2);
//        object1.showPerson();
        System.out.println(Person.getCountPerson());

    }
}
