package com.ps.labs.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// @Ignore -> 1er piège
public class Exo1AssertsTest {

    private static final List<String> NAMES = new ArrayList<>();

    @Before
    public void setUp() {
        /**
         * 2nd piège : NAMES étant déclaré static d'un test à l'autre il conserve toutes ses valeurs.
         * Pour que tous les tests fonctionnent, il convient alors de le réinitialiser à chaque début de test.
         *
         * Note - @After aurait également très bien pu faire l'affaire.
         */
        NAMES.clear();
    }

    @Test
    public void testAssertTrue() {
        // Tester que la liste 'NAMES' soit bien vide
        Assert.assertTrue("Should be true", NAMES.isEmpty());
    }

    @Test
    public void testAssertFalse() {
        // Tester que la liste 'NAMES' ne soit pas vide
        NAMES.add("jean");
        Assert.assertFalse(NAMES.isEmpty());
    }

    @Test
    public void testAssertNull() {
        // Tester que la première valeur de 'NAMES' soit null
        NAMES.add(null);
        Assert.assertNull(NAMES.get(0));
    }

    @Test
    public void testAssertNotNull() {
        // Tester que la première valeur de 'NAMES' ne soit pas null
        NAMES.add("Olivier");
        Assert.assertNotNull(NAMES.get(0));
    }

    @Test
    public void testAssertEquals() {
        // Tester que la première valeur de la liste 'NAMES' soit égale à "Lamasticot"
        NAMES.add("Lamasticot");
        Assert.assertEquals("Lamasticot", NAMES.get(0));
    }

    @Test
    public void testAssertArrayEquals() {
        final byte[] expected = "trial".getBytes();
        final byte[] actual = "trial".getBytes();
        // Vérifier que ces 2 tableaux de bytes soient égaux
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAssertNotSame() {
        final Integer number1 = Integer.valueOf(768);
        final Integer number2 = Integer.valueOf(768);
        // Tester que ces 2 objets sont égaux mais ne font pas référence au même objet
        // Indice - 2 assertions sont attendues
        Assert.assertNotSame(number1, number2);
        Assert.assertEquals(number1, number2);
    }

    @Test
    public void testAssertSame() {
        // Tester que 2 objets sont égaux et font références au même objet
        final Integer number1 = Integer.valueOf(768);
        Assert.assertSame(number1, number1);
        Assert.assertEquals(number1, number1);
    }

    // JUnit Matchers assertThat
    @Test
    public void testAssertThatBothContainsString() {
        // Vérifier que la première valeur de 'NAMES' contienne la chaine de caractère "Jean" et "Paul"
        // Indice - Utiliser le CoreMatchers de la librairie Hamcrest
        NAMES.add("Jean-Paul");
        MatcherAssert.assertThat(NAMES.get(0), CoreMatchers.both(CoreMatchers.containsString("Jean")).and(
            CoreMatchers.containsString("Paul")));
    }

    @Test
    public void testAssertThatHasItems() {
        // Vérifier que 'NAMES' contienne les valeurs "Arthur", "Marc" et "Julien"
        NAMES.addAll(Arrays.asList("Arthur", "Marc", "Abdoul"));
        MatcherAssert.assertThat(NAMES, CoreMatchers.hasItems("Arthur", "Marc", "Abdoul"));
    }

    @Test
    public void testAssertThatEveryItemContainsString() {
        // Vérifier que chaque nom de 'NAMES' contient un "t"
        NAMES.addAll(Arrays.asList("Clément", "Martine", "Jonathan"));
        MatcherAssert.assertThat(NAMES, CoreMatchers.everyItem(CoreMatchers.containsString("t")));
    }

    @Test
    public void testAssertThatHamcrestCoreMatchers() {
        // Vérifier que tous les éléments de 'NAMES' commencent par "Ba", contiennent un "r" et ne contiennent pas un "o"
        NAMES.addAll(Arrays.asList("Barbapapa", "Barbant", "Barbe"));
        MatcherAssert.assertThat(NAMES, CoreMatchers.everyItem(CoreMatchers.allOf(
            CoreMatchers.startsWith("Ba"), CoreMatchers.containsString("r"), CoreMatchers.not(CoreMatchers.containsString("o")))));
    }

}
