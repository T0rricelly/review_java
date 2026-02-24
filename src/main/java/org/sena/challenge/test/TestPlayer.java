package org.sena.challenge.test;

import org.sena.challenge.*;

import java.util.*;
import java.util.Optional;


public class TestPlayer {
    public static void main(String[] args) {
        Scanner findNumberPlayer = new Scanner(System.in);
        System.out.println("\nCurry");
        Player curry = new Player("Curry", 34, 30, "Base", "Warriors");
        curry.scorePoint(3);
        curry.scorePoint(3);
        System.out.println("\nLebron");
        Player lebron = new Player("Lebron", 34, 23, "Ala-pivót", "Lakers");
        lebron.scorePoint(1);
        lebron.scorePoint(2);
        lebron.scorePoint(2);
        lebron.scorePoint(2);
        lebron.scorePoint(2);
        lebron.scorePoint(1);
        lebron.scorePoint(1);
        lebron.scorePoint(3);
        lebron.scorePoint(3);
        lebron.scorePoint(3);
        Player tatum = new Player("Tatum", 30, 0, "Alero", "Celtics");
        tatum.scorePoint(3);
        tatum.scorePoint(3);
        tatum.scorePoint(3);
        tatum.scorePoint(3);
        tatum.scorePoint(3);
        tatum.scorePoint(3);
        tatum.scorePoint(3);
        tatum.scorePoint(3);
        tatum.scorePoint(3);
        Player jokic = new Player("Jokic", 38, 3, "Pivót", "Denver");
        jokic.scorePoint(1);
        jokic.scorePoint(2);
        jokic.scorePoint(1);
        jokic.scorePoint(3);
        jokic.scorePoint(3);
        Player klay = new Player("Klay", 32, 20, "Escolta", "Maverics");
        klay.scorePoint(1);
        klay.scorePoint(3);
        klay.scorePoint(1);
        klay.scorePoint(1);
        System.out.println("\nCoach");
        Coach joe = new Coach("Joe Mazzulla", 37, 12);
        joe.presented();

        // Create Roster
//        System.out.println("\nPresentacion del roster");
//        List<Player> allStar = Arrays.asList(curry, tatum, jokic, klay, lebron);
//        System.out.println("\nBuscar un jugador en el roster");
//        System.out.println("Ingresa el numero del jugador a buscar:");
//        int numberSearchPlayer = findNumberPlayer.nextInt();
//        Optional<Player> numberPlayer = allStar.stream()
//                .filter((n) -> n.getNumberPlayer() == numberSearchPlayer)
//                .findFirst();
//        if (numberPlayer.isPresent()){
//            System.out.println("Jugador encontrado: " + numberPlayer.get());
//        }else {
//            System.out.println("No se encuentra el jugador");
//        }
//
//
//        // Analitics match points
//        System.out.println("\nEstadisticas partidos" );
//        Analitycs analitycs = new Analitycs();
//        analitycs.calculateMatchPoints();
//
//
//        // Mostrar toString de cada objeto persona
        System.out.println("\nPersonas activas de la liga");
        List<Person> personLeague = Arrays.asList(curry, tatum, jokic, klay, lebron, joe);
        personLeague.forEach(System.out::println);
        System.out.println("El total de personas inscritas en la liga es " + Person.getCountPerson() + " personas");

        // Lista de personas
        System.out.println();
        List<Statistics> person = Arrays.asList(curry, lebron, klay, jokic, tatum, joe);

        var mostScoredPoints = person.stream()
                .filter((o) -> o instanceof Player)
                .map((o) -> (Player) o)
                .filter((player -> player.getAmountPoints() > 18))
                .toList();
        System.out.println("Mayores anotadores");
        mostScoredPoints.forEach(System.out::println);

        // Sumar todos los puntos de los jugadores
        var totalPoints = person.stream()
                        .filter((o) -> o instanceof Player)
                        .map((p) -> (Player) p)
                        .mapToInt((Player::getAmountPoints))
                        .sum();
        System.out.println("El total de puntos entre todos los jugadores de la liga es " + totalPoints);


        findNumberPlayer.close();
    }
}
