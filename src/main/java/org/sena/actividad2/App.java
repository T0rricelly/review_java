package org.sena.actividad2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Traveler santiago = new Traveler(1031532697, "Santiago", "Martinez", "santiagoM@gmail.com", 23, "Bogota", "Medellin", true, false);
//        Traveler maria = new Traveler(1234567842, "Maria", "Cortez", "mariaC@gmail.com", 30, "cartagena", "Bogota", false, true);
//        Traveler mario = new Traveler(1234567842, "Mario", "Cortez", "marioC@gmail.com", 4, "Medellin", "Bogota", false, false);
//        Ticket ticket1 = new Ticket(25.0f,santiago);
//        Ticket ticket2 = new Ticket(25.0f,maria);
//        Ticket ticket3 = new Ticket(25.0f,maria);
//        ticket1.showTicket(santiago);
//        ticket2.showTicket(maria);
//        ticket3.showTicket(mario);
        System.out.println("Crear viajero");
        System.out.println("Ingrese el documento");
        int document = sc.nextInt();
        System.out.println("Ingrese sus nombres");
        String names = sc.next();
        System.out.println("Ingrese sus apellidos");
        String last_names = sc.next();
        System.out.println("Ingrese su correo");
        String email = sc.next();
        System.out.println("Ingrese su edad");
        int age = sc.nextInt();
        System.out.println("Ingrese la ciudad de origen");
        String start_location = sc.next();
        System.out.println("Ingrese la ciudad de destino");
        String end_location = sc.next();
        System.out.println("Es extranjero");
        boolean is_foreign = (sc.next().toLowerCase().equals("si") ? true : false);
        System.out.println("Esta embarazada");
        boolean is_pregnant = (sc.next().toLowerCase().equals("si") ? true : false);
        System.out.println("Ingrese el peso de su equipaje");
        float weight = sc.nextFloat();
        Traveler traveler = new Traveler(document,names,last_names,email,age,start_location,end_location,is_foreign,is_pregnant);
        Ticket ticket = new Ticket(weight, traveler);
        ticket.showTicket(traveler);

    }
}
