package com.ps.labs;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class Exo1StubbingTest {

    @Test
    public void testStubbing() {
        final List mockedList = Mockito.mock(List.class);

        // Faites fonctionner les 2 assertions suivantes :
        // Assert.assertEquals("first", mockedList.get(0));
        // Assert.assertEquals("second", mockedList.get(1));
    }

    @Test
    public void testStubbingConsecutiveCalls() {
        final List mockedList = Mockito.mock(List.class);

        // Faites fonctionner les 2 assertions suivantes :
        // Assert.assertEquals("first", mockedList.get(0));
        // Assert.assertEquals("Again first element !", mockedList.get(0));
    }

    @Test
    public void testArgumentMatchers() {
        final List mockedList = Mockito.mock(List.class);

        // 1. Faites fonctionner les assertions suivantes :
        // IntStream.range(0, 500).forEach(i -> {
        //     Assert.assertEquals("element", mockedList.get(i));
        // });

        // 2. Vérifier que mockedList.get(i) est appelé X fois.
    }

    @Test
    public void testThrowException() {
        final List mockedList = Mockito.mock(List.class);

        // Faites en sorte que l'appel suivant lève une RuntimeException (indice : thenThrow)
        mockedList.get(0);
    }

    @Test
    public void testVoidMethod() {
        final List mockedList = Mockito.mock(List.class);

        // Faites en sorte que l'appel suivant lève une RuntimeException
        mockedList.clear();
    }

}
