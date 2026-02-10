package org.sena.oop.inheritance;


public class Animal {
    protected void makeNoise(){
        System.out.println("El animal hace un ruido");
    }
    // Protected sirve para acceder solo desde una clase hija
    protected void eat(){
        System.out.println("Como muchas veces al dia");
    }
    protected void sleep(){
        System.out.println("Duermo muchas horas al dia");
    }
}
