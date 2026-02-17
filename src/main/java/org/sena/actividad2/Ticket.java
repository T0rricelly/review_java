package org.sena.actividad2;

public class Ticket {
    private final int id_ticket;
    private float weightSuitcase;
    private float price_excess;
    private float priceTravel;
    private static int countTicket;
    private Traveler traveler;


    // Constructor
    public Ticket(float weightSuitcase, Traveler traveler) {
        this.id_ticket = ++countTicket;
        this.weightSuitcase = weightSuitcase;
        this.traveler = traveler;
    }

    public float calculatePrice(Traveler traveler) {
        // Validar lugar de inicio y lugar de destino
        if (traveler.getStartLocation().toLowerCase().equals("bogota") && traveler.getEndLocation().toLowerCase().equals("medellin") || traveler.getStartLocation().toLowerCase().equals("medellin") && traveler.getEndLocation().toLowerCase().equals("bogota")) {
            priceTravel = 240000;
            price_excess = 5000;
        }
        else if (traveler.getStartLocation().toLowerCase().equals("bogota") && traveler.getEndLocation().toLowerCase().equals("cali") || traveler.getStartLocation().toLowerCase().equals("cali") && traveler.getEndLocation().toLowerCase().equals("bogota")){
            priceTravel = 260000;
            price_excess= 6000;
        }else if (traveler.getStartLocation().toLowerCase().equals("bogota") && traveler.getEndLocation().toLowerCase().equals("cartagena") || traveler.getStartLocation().toLowerCase().equals("cartagena") && traveler.getEndLocation().toLowerCase().equals("bogota")){
            priceTravel = 340000;
            price_excess = 9000;
        }else if(traveler.getStartLocation().toLowerCase().equals("bogota") && traveler.getEndLocation().toLowerCase().equals("santa marta") || traveler.getStartLocation().toLowerCase().equals("santa marta") && traveler.getEndLocation().toLowerCase().equals("bogota")){
            priceTravel = 350000;
            price_excess = 9500;
        }else if(traveler.getStartLocation().toLowerCase().equals("bogota") && traveler.getEndLocation().toLowerCase().equals("leticia") || traveler.getStartLocation().toLowerCase().equals("leticia") && traveler.getEndLocation().toLowerCase().equals("bogota")){
            priceTravel = 480000;
            price_excess = 15000;
        }else if(traveler.getStartLocation().toLowerCase().equals("bogota") && traveler.getEndLocation().toLowerCase().equals("san andres") || traveler.getStartLocation().toLowerCase().equals("san andres") && traveler.getEndLocation().toLowerCase().equals("bogota")){
            priceTravel = 520000;
            price_excess = 18000;
        }

        // Validaciones para mujeres embarazadas
        if (traveler.getisPregnant()) {
            priceTravel += (priceTravel * 0.10f);
            if (this.weightSuitcase > 20.0f) {
                float amountWeight = this.weightSuitcase - 20.0f;
                priceTravel += price_excess * amountWeight;
            }
        } else {
            // Validacion de edad para recargos
            if (traveler.getAge() >= 5 && traveler.getAge() <= 70) {
                // Operacion para equipajes que exceden los 20kg
                if (this.weightSuitcase > 20.0f) {
                    float amountWeight = this.weightSuitcase - 20.0f;
                    priceTravel += price_excess * amountWeight;
                    priceTravel += (priceTravel * 0.20f);
                }
            } else {
                // Porcentaje aeropuertario
                priceTravel += (priceTravel * 0.20f);
            }
        }

        return (traveler.getIsForeign() ? priceTravel / 3661 : (int) priceTravel);
    }

    public void showTicket (Traveler traveler){
        System.out.println(
                "Ticket Aeropuertario {\n" +
                "\tId ticket = " + id_ticket +
                "\n\tDocumento = " + traveler.getDocument() +
                ",\n\tNombres = '" + traveler.getNames() + '\'' +
                ",\n\tApellidos = '" + traveler.getLast_names() + '\'' +
                ",\n\tEmail = '" + traveler.getEmail() + '\'' +
                ",\n\tEdad = " + traveler.getAge() +
                ",\n\tCiudad de inicio = '" + traveler.getStartLocation() + '\'' +
                ",\n\tCiudad de destino = '" + traveler.getEndLocation() + '\'' +
                ",\n\tExtranjero = " + (traveler.getIsForeign() ? "SI":"NO") +
                ",\n\tEmbarazada = " + (traveler.getisPregnant() ? "SI": "NO") +
                ",\n\tPeso de equipaje= " + this.weightSuitcase + "kg" +
                ",\n\tPrecio de viaje = $" + calculatePrice(traveler) + (traveler.getIsForeign() ? " USD" : " COP") +
                "\n}");
    }

    // Getters and Setters
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
