package org.sena.oop.class_example;
public class Person extends Object{
    private String name;
    private String last_name;
    private static int countPerson;
    private int id;

    public Person(String name, String last_name){
        this.name = name;
        this.last_name = last_name;
        this.id = ++Person.countPerson;
    }

    @Override
    public String toString(){
        return "Nombre " + this.name + ", apellido " + this.last_name + ", id unico " + id;
    }

//    public void showPerson(){
//        System.out.println("Nombre: " + name);
//        System.out.println("Apellido: " + last_name);
//    }


    // Getters and Setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLast_name(){
        return this.last_name;
    }
    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    public static int getCountPerson(){
        return Person.countPerson;
    }
    public int getId(){
        return this.id;
    }



}
