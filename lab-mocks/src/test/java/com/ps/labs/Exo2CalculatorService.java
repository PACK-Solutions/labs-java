package com.ps.labs;

import com.ps.labs.calculator.CalculatorService;

import org.junit.Test;
import org.mockito.Mockito;

public class Exo2CalculatorService {

    @Test
    public void testCallRealMethod() {
        final CalculatorService mockService = Mockito.mock(CalculatorService.class);

        // Faites fonctionner les assertions suivantes :

        // IntStream.range(0, 100).forEach(i -> {
        //     Assert.assertEquals("Real method has to be call !", i, mockService.add(0, i));
        // });
        // IntStream.range(666, 777).forEach(i -> {
        //     Assert.assertEquals("Look at argThat !", 42, mockService.add(i, i));
        // });
    }

    @Test
    public void testVerifyInteractions() {
        final CalculatorService mockService = Mockito.mock(CalculatorService.class);
        final CalculatorService mockService2 = Mockito.mock(CalculatorService.class);
        final CalculatorService mockService3 = Mockito.mock(CalculatorService.class);

        // Vérifier que mockService appelle dans cet ordre précis :
        //  * la méthode "add" 2 fois
        //  * la méthode "divide" 3 fois
        //  * la méthode "add" 1 fois
        // Vérifier que la méthode "substract" n'est jamais appelé
        // Vérifier que mockService2 et mockService3 ne soient jamais utilisés
    }

}
