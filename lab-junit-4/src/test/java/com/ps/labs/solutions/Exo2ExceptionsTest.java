package com.ps.labs.solutions;

import java.util.ArrayList;

import com.ps.labs.exceptions.BusinessException;

import org.junit.Assert;
import org.junit.Test;

public class Exo2ExceptionsTest {

    @Test
    public void testExceptionWay1() {
        try {
            new ArrayList<Object>().get(0);
            Assert.fail();
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExceptionWay2() {
        new ArrayList<Object>().get(0);
    }

    @Test
    public void testExceptionWay3() throws BusinessException {
        // Lever une BusinessException et vérifier qu'il s'agit bien d'une BusinessException et que son message est égale à
        // "Une erreur attendue s'est produite"

        final BusinessException exception = Assert.assertThrows(BusinessException.class, () -> {
            throw new BusinessException("Une erreur attendue s'est produite");
        });
        Assert.assertEquals("Une erreur attendue s'est produite", exception.getMessage());

        // Une autre solution consistant à utiliser la rule ExpectedException est maintenant dépréciée :
        // https://github.com/junit-team/junit4/blob/master/doc/ReleaseNotes4.13.md#pull-request-1633-deprecate-expectedexceptionnone
    }

}
