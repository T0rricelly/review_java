package org.sena.exercise_poo;

import java.util.List;

public class PaymentServiceImpl implements IPaymentService {
    // Implementacion del metodo de IPaymentService
    @Override
    public double calculateTotalContributions(List<Contributor> contributors) {
        double totalContributions = 0;
        System.out.println("Cotizantes");
        // Recorrer la lista de cotizantes por medio de For each
        for (Contributor c : contributors) {
            System.out.println(c);
            // Suma todos los valores de cada aportante
            totalContributions += c.contributions();
        }
        return totalContributions;
    }
}
