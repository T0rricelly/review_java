package org.sena.challenge;


public class Roster {

    public void presentedPlayers(Player[] roster) {
        for (int i = 0; i < roster.length; i++) {
            roster[i].presented();
        }
    }

    public void searchPlayer(Player[] roster, int numberPlayer) {
        boolean find = true;
        for (int i = 0; i < roster.length; i++) {
            if (roster[i].getNumberPlayer() == numberPlayer) {
                System.out.println("Jugador encontrado");
                roster[i].presented();
                find = true;
                break;
            }
            find = false;
        }
        if (find == false) System.out.println("No se encontro el jugador en el roster");
    }
}
