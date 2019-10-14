package com.ps.labs;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class Exo1AssertsTest {

    private List<String> names = new ArrayList<String>();

    @Test
    public void testAssertTrue() {
        // Tester que la liste names soit bien vide
    }

    @Test
    public void testAssertFalse() {
        // Tester que la liste names ne soit pas vide
    }

    @Test
    public void testAssertNull() {
        // Tester que la première valeur de names soit null
    }

    @Test
    public void testAssertNotNull() {
       // Tester que la première valeur de names ne soit pas null
    }

    @Test
    public void testAssertEquals() {
        // Tester que la première valeur de la liste names soit égale à "Lamasticot"
    }

    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        // Vérifier que ces 2 tableaux de bytes soient égaux
    }

    @Test
    public void testAssertNotSame() {
        Integer number1 = Integer.valueOf(768);
        Integer number2 = Integer.valueOf(768);
        // Tester que ces 2 objets sont égaux mais ne font pas référence au même objet
        // Indice - 2 assertions sont attendues
    }

    @Test
    public void testAssertSame() {
        // Tester que 2 objets sont égaux et font références au même objet
    }

    // JUnit Matchers assertThat
    @Test
    public void testAssertThatBothContainsString() {
        // Vérifier que la première valeur de 'names' contienne la chaine de caractère "Jean" et "Paul"
        // Indice - Utiliser le CoreMatchers de la librairie Hamcrest
    }

    @Test
    public void testAssertThatHasItems() {
        // Vérifier que 'names' contienne les valeurs "Arthur", "Marc" et "Julien"
    }

    @Test
    public void testAssertThatEveryItemContainsString() {
        // Vérifier que chaque nom de 'names' contient un "t"
    }

    @Test
    public void testAssertThatHamcrestCoreMatchers() {
        // Vérifier que tous les éléments de 'names' commencent par "Ba", contiennent un "r" et ne contiennent pas un "o"
    }

}
