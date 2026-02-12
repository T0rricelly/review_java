package org.sena.challenge.test;

import org.sena.challenge.*;

import java.util.Scanner;


public class TestPlayer {
    public static void main(String[] args) {
        Scanner findNumberPlayer = new Scanner(System.in);
        System.out.println("\nCurry");
        Player curry = new Player("Curry", 34, 30, "Base", "Warriors");
        curry.scorePoint(3);
        curry.scorePoint(3);

        System.out.println("\nLebron");
        Player lebron = new Player("Lebron", 34, 23, "Ala-pivót", "Lakers");
        lebron.scorePoint(2);
        lebron.scorePoint(1);
        lebron.scorePoint(3);
        Player tatum = new Player("Tatum", 30, 0, "Alero", "Celtics");
        Player jokic = new Player("Jokic", 38, 3, "Pivót", "Denver");
        Player klay = new Player("Klay", 32, 20, "Escolta", "Maverics");

        System.out.println("\nCoach");
        Coach joe = new Coach("Joe Mazzulla", 37, 12);
        joe.presented();

        // Create Roster
        System.out.println("\nPresentacion del roster");
        Player[] allStar = new Player[5];
        allStar[0] = curry;
        allStar[1] = lebron;
        allStar[2] = tatum;
        allStar[3] = jokic;
        allStar[4] = klay;
        Roster roster = new Roster();
        roster.presentedPlayers(allStar);
        System.out.println("\nBuscar un jugador en el roster");
        System.out.println("Ingresa el numero del jugador a buscar:");
        int searchPlayer = findNumberPlayer.nextInt();
        roster.searchPlayer(allStar,searchPlayer);



        // Analitics match points
        System.out.println("\nEstadisticas partidos" );
        Analitycs analitycs = new Analitycs();
        analitycs.calculateMatchPoints();


        // Mostrar toString de cada objeto persona
        System.out.println("\nPersonas activas de la liga");
        Person[] personLeague = new Person[6];
        personLeague[0] = curry;
        personLeague[1] = lebron;
        personLeague[2] = klay;
        personLeague[3] = jokic;
        personLeague[4] = tatum;
        personLeague[5] = joe;

        for (int i = 0; i < personLeague.length; i++) {
            System.out.println(personLeague[i]);
        }
        System.out.println("El total de personas inscritas en la liga es " + Person.getCountPerson() + " personas");


        findNumberPlayer.close();
    }
}
