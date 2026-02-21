package org.sena.challenge;

public abstract class Person {
    private static int countPerson;
    private String name;
    private int age;

    protected Person(String name, int age){
        this.name = name;
        this.age = age;
        countPerson++;
    }

    // Methods
    public abstract void presented();


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
    public static int getCountPerson(){
        return Person.countPerson;
    }
}
