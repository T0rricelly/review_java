package org.sena.actividad2;

public class Ticket {
    private final int id_ticket;
    private float weightSuitcase;
    private int priceTravel;
    private static int countTicket;
    private Traveler traveler;

    public Ticket(float weightSuitcase) {
        this.id_ticket = ++countTicket;
        this.weightSuitcase = weightSuitcase;
    }






    @Override
    public String toString() {
        return "Ticket{\n" +
                "id_ticket=" + id_ticket +
                ",\nweightSuitcase=" + weightSuitcase +
                ",\npriceTravel=" + priceTravel +
                "\n}";
    }
}
