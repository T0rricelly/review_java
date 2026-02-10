package org.sena.oop.inheritance;


class TestAnimal {
    // Metodo polimorfico
    static void printNoise(Animal animal){
        animal.makeNoise();
    }
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Dog animal = new Dog();
        Cat animal = new Cat();
        printNoise(animal);
    }
}
