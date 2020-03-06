package com.ps.labs.solutions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.ps.labs.dto.Person;

import org.junit.Assert;
import org.junit.Test;

public class Exo4PersonUtilsTest {

    @Test
    public void testVerifyMajority() {
        Assert.assertTrue(PersonUtils.isMajor(new Person("DUPONT", "Michel", LocalDate.of(1980, 11, 24))));
    }

    @Test
    public void testVerifyMinority() {
        Assert.assertFalse(PersonUtils.isMajor(new Person("DUPOND", "Jean", LocalDate.of(LocalDate.now().getYear() - 4, 11, 24))));
    }

    private static class PersonUtils {

        public static boolean isMajor(final Person person) {
            return person.getBirthDate() != null &&
                ChronoUnit.DAYS.between(person.getBirthDate(), LocalDate.now().minusYears(18)) >= 0;
        }
    
    }

}
