package org.sena.actividad2;

public class Ticket {
    private final int id_ticket;
    private float weightSuitcase;
    private float price_excess;
    private float priceTravel;
    private static int countTicket;
    private Traveler traveler;

    public Ticket(float weightSuitcase, Traveler traveler) {
        this.id_ticket = ++countTicket;
        this.weightSuitcase = weightSuitcase;
        this.traveler = traveler;
    }

    public int calculatePrice(Traveler traveler) {
        if (traveler.getStartLocation().toLowerCase() == "bogota" && traveler.getEndLocation().toLowerCase() == "medellin") {
            priceTravel = 240000;
            price_excess = 5000;
        }
        if (traveler.getisPregnant()) {
            priceTravel += (priceTravel * 0.10f);
            if (this.weightSuitcase > 20.0f) {
                float amountWeight = this.weightSuitcase - 20.0f;
                priceTravel += price_excess * amountWeight;
            }
        } else {
            if (traveler.getAge() > 5 && traveler.getAge() < 70) {
                if (this.weightSuitcase > 20.0f) {
                    float amountWeight = this.weightSuitcase - 20.0f;
                    priceTravel += price_excess * amountWeight;
                    priceTravel += (priceTravel * 0.20f);
                }
            } else {
                priceTravel += (priceTravel * 0.20f);
            }
        }
        return (int) priceTravel;
    }


    public int getId_ticket() {
        return id_ticket;
    }

    public float getWeightSuitcase() {
        return weightSuitcase;
    }

    public void setWeightSuitcase(float weightSuitcase) {
    }

    public float getPriceTravel() {
        return priceTravel;
    }

    public void setPriceTravel(float priceTravel) {
        this.priceTravel = priceTravel;
    }

    public static int getCountTicket() {
        return countTicket;
    }

    public static void setCountTicket(int countTicket) {
        Ticket.countTicket = countTicket;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
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
