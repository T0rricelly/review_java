package org.sena.challenge;

public class Coach extends Person implements Statistics{
    private int yearsExperience;
    private int gameWins;

    // Builder
    public Coach (String name, int age, int yearsExperience){
        super(name, age);
        this.yearsExperience = yearsExperience;
        this.gameWins = 689;
    }
    // Methods
    @Override
    public void showSummary(){
        System.out.println("El total de juego ganados de " + this.getName() + " son " + this.getGameWins());
    }
    @Override
    public void presented(){
        System.out.println("Hola soy el coach " + getName() + " y tengo " + getYearsExperience() + " años de experiencia");
    }
    // Getters and Setter

    public int getGameWins() {
        return gameWins;
    }

    public void setGameWins(int gameWins) {
        this.gameWins = gameWins;
    }

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
