package org.sena.challenge_poke;

public class Bulbasaur extends Pokemon implements IPlant{

    public Bulbasaur() {
    }

    // Metodos de interface
    @Override
    public void attackParalyze() {
        this.getNamePokemon();
    }

    @Override
    public void attackDrain() {

    }

    // Metodos clase abstracta
    @Override
    public void attackTackle() {

    }

    @Override
    public void attackScratch() {

    }

    @Override
    public void attackBite() {

    }
}
