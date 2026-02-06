package org.sena.oop.challenge.test;

import org.sena.oop.challenge.Player;
import org.sena.oop.challenge.Coach;

public class TestPlayer {
    public static void main(String[] args) {
        System.out.println("Curry");
        Player curry = new Player("Curry", 34, 30, "Base");
        curry.scorePoint(3);
        curry.scorePoint(3);

        System.out.println("Lebron");
        Player lebron = new Player("Lebron", 34,23, "Alero");
        lebron.scorePoint(2);
        lebron.scorePoint(1);
        lebron.scorePoint(3);
        lebron.setAmountPoints(-5);

        System.out.println("Estadisticas");
        curry.presented();
        curry.statistics();
        lebron.presented();
        lebron.statistics();

        System.out.println("Coach");
        Coach joe = new Coach("Joe Mazzulla", 37, 12);
        joe.presented();
    }
}
