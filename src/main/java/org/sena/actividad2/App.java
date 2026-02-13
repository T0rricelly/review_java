package org.sena.actividad2;

public class App {
    public static void main(String[] args) {
        Traveler santiago = new Traveler(1031532697, "Santiago", "Martinez", "santiagoM@gmail.com", 26, "Bogota", "Medellin", true, false);
        System.out.println(santiago);
        Ticket ticket1 = new Ticket(15.2f);
        System.out.println(ticket1);
    }
}
