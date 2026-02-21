package org.sena.exercise_poo;

public class Independent extends Contributor {
    // Atributos de descuento de cada aportante
    private double health = 0.125;
    private double pension = 0.16;

    // Constructor
    public Independent(String name, double ibc) {
        super(name, ibc);
    }

    // Calculo de aporte persona independiente
    @Override
    public double contributions() {
        double ibcBaseIndependent = getIbc() * 0.40;
        double contributionHealthIndependent;
        double contributionPensionIndependent;
        double totalContributeIndependent;

        // Logica de calculo
        contributionHealthIndependent = ibcBaseIndependent * health;
        contributionPensionIndependent = ibcBaseIndependent * pension;
        totalContributeIndependent = contributionHealthIndependent + contributionPensionIndependent;
        return totalContributeIndependent;
    }
}
