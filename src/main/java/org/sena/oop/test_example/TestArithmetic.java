package org.sena.oop.test_example;

import org.sena.oop.class_example.Arithmetic;

public class TestArithmetic {
    public static void main(String[] args) {
        System.out.println("Creacion de objetos");
        System.out.println("Objeto 1");
        Arithmetic arit1 = new Arithmetic(5,7);
        arit1.add();
        arit1.subtract();

    }
}
