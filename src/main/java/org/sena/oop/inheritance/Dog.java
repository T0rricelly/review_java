package org.sena.oop.inheritance;

public class Dog extends Animal{

    @Override
    protected void sleep(){
        System.out.println("Duermo 15 horas al dia");
        System.out.println("Metodo clase Padre: ");
        super.sleep();
    }
    public void makeNoise(){
        System.out.println("Puedo ladrar");
    }
}
