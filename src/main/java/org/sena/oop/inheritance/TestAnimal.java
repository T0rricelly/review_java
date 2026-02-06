package org.sena.oop.inheritance;


class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.sleep();
        // animal1.makeNoise(); // No existe en la super clase

        Dog dog1 = new Dog();
        dog1.makeNoise();
        dog1.sleep();
        dog1.eat();
    }
}
