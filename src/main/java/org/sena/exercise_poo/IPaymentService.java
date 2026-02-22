package org.sena.exercise_poo;

import java.util.List;

public interface IPaymentService {
    // Metodo para calcular el total de aportes de las personas listadas
    double calculateTotalContributions(List<Contributor> contributors);
}
