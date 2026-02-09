package org.sena.challenge;

public class Persona {
    private String name;
    private int age;

    public Persona(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Methods
    public void presented(){
        System.out.println("Hola mi nombre es " + name);
    }

    // Getters and Setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
