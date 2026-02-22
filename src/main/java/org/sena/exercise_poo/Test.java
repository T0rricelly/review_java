package org.sena.exercise_poo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        try {
            PaymentServiceImpl paymentService = new PaymentServiceImpl();
//            Contributor santiago = new Dependent("Santiago", 1200000);
            Contributor maria = new Independent("Maria", 1600000);
            Contributor pedro = new Independent("Pedro", 1700000);
            Contributor alejandra = new Dependent("Alejandra", 1300000);
            List<Contributor> contributors = new ArrayList<>();
            contributors.add(maria);
            contributors.add(pedro);
            contributors.add(alejandra);

            System.out.println("El total a recaudar es $" + paymentService.calculateTotalContributions(contributors) + " COP");

        } catch (InvalidIbcException e) {
            System.out.println(e.getMessage());
        }
    }
}
