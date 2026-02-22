package org.sena.exercise_poo;

public class Dependent extends Contributor {
    // Atributos de descuento de cada aportante
    private double health = 0.04;
    private double pension = 0.04;

    // Constructor
    public Dependent(String name, double ibc) throws InvalidIbcException {
        super(name, ibc);
    }

    // Calculo de aporte persona dependiente
    @Override
    public double contributions() {
        double contributionHealthDependent;
        double contributionPensionDependent;
        double totalContributionDependent;
        // Logica de suma de pension y salud
        contributionHealthDependent = getIbc() * health;
        contributionPensionDependent = getIbc() * pension;
        totalContributionDependent = contributionHealthDependent + contributionPensionDependent;
        return totalContributionDependent;
    }

    @Override
    public String toString() {
        return "Cotizante dependiente{\n" +
                "\tId = " + getId() +
                "\n\tNombre = " + getName() +
                ",\n\taportes salud y pension = $" + contributions() +
                "\n}";
    }
}
