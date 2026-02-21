package org.sena.challenge_poke;

public abstract class Pokemon {
    private int numberPokedex;
    private String namePokemon;
    private double weight;
    private String gender;
    private int season;


    public abstract void attackTackle();
    public abstract void attackScratch();
    public abstract void attackBite();

    // Getters y Setters

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberPokedex() {
        return numberPokedex;
    }

    public void setNumberPokedex(int numberPokedex) {
        this.numberPokedex = numberPokedex;
    }

    public String getNamePokemon() {
        return namePokemon;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }
}
