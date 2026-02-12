package org.sena.challenge;

public class Coach extends Person {
    private int yearsExperience;

    // Builder
    public Coach (String name, int age, int yearsExperience){
        super(name, age);
        this.yearsExperience = yearsExperience;
    }
    // Methods
    @Override
    public void presented(){
        System.out.println("Hola soy el coach " + getName() + " y tengo " + getYearsExperience() + " años de experiencia");
    }
    // Getters and Setter
    public int getYearsExperience(){
        return this.yearsExperience;
    }
    public void setYearsExperience(int yearsExperience){
        this.yearsExperience = yearsExperience;
    }

    @Override
    public String toString(){
        return "Nombre: " + getName() + " edad: " + getAge() + " años de experiencia: " + getYearsExperience();
    }
}
