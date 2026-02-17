package org.sena.actividad2;

public class App {
    public static void main(String[] args) {
        Traveler santiago = new Traveler(1031532697, "Santiago", "Martinez", "santiagoM@gmail.com", 23, "Bogota", "Medellin", true, false);
        Traveler maria = new Traveler(1234567842, "Maria", "Cortez", "mariaC@gmail.com", 30, "cartagena", "Bogota", false, true);
        Traveler mario = new Traveler(1234567842, "Mario", "Cortez", "marioC@gmail.com", 4, "Medellin", "Bogota", false, false);
        Ticket ticket1 = new Ticket(25.0f,santiago);
        Ticket ticket2 = new Ticket(25.0f,maria);
        Ticket ticket3 = new Ticket(25.0f,maria);
        ticket1.showTicket(santiago);
        ticket2.showTicket(maria);
        ticket3.showTicket(mario);

    }
}
