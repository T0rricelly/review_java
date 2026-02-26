package org.sena.exerscise_poo;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.sena.exercise_poo.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTest {
    @Test
    public void testContributionDependent() throws InvalidIbcException {
        // Given
        Dependent dependent = new Dependent("Santiago",1300000);

        // When
        double result = dependent.contributions();

        // Then
        assertEquals(104000.0d, result);
    }

    @Test
    public void testContributionsDependentError() {

        // Then
        assertThrows(InvalidIbcException.class, () -> {
            Dependent dependent = new Dependent("Santiago",1200000);
        });
    }


    @Test
    public void testContributionsIndependent() throws InvalidIbcException {
        // Given
        Independent independent = new Independent("Pedro",1700000);

        // When
        double result = independent.contributions();

        // Then
        assertEquals(193800.0d, result);
    }

    @Test
    public void testContributionsIndependentError(){
        assertThrows(InvalidIbcException.class, () -> {
            Independent independent = new Independent("Pedro",1200000);
        });
    }

    @Test
    public void testCalculateTotalContributions() throws InvalidIbcException {
        // Given
        PaymentServiceImpl paymentService = new PaymentServiceImpl();
        Contributor maria = new Independent("Maria", 1600000);
        Contributor pedro = new Independent("Pedro", 1700000);
        Contributor alejandra = new Dependent("Alejandra", 1300000);
        List<Contributor> contributors = List.of(maria, pedro, alejandra);
        // When
        double result = paymentService.calculateTotalContributions(contributors);
        // Then
        assertEquals(480200.0d, result);

    }
}
