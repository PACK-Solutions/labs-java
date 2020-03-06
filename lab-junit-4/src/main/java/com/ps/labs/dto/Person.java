package com.ps.labs.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {

    private static final long serialVersionUID = 6817506822556844457L;

    private final String lastName;
    private final String firstName;
    private final LocalDate birthDate;

    public Person(final String lastName, final String firstName, final LocalDate birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Person [birthDate=" + birthDate + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}
