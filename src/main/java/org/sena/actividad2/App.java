package org.sena.actividad2;

public class App {
    public static void main(String[] args) {
        Traveler santiago = new Traveler(1031532697, "Santiago", "Martinez", "santiagoM@gmail.com", 23, "bogota", "medellin", true, false);
        Traveler maria = new Traveler(1031532697, "Maria", "Cortez", "mariaC@gmail.com", 30, "bogota", "medellin", false, true);
        Ticket ticket1 = new Ticket(25.0f,santiago);
        Ticket ticket2 = new Ticket(25.0f,maria);
        System.out.println("$ " + ticket1.calculatePrice(santiago) );
        System.out.println("$ " + ticket2.calculatePrice(maria) );

    }
}
