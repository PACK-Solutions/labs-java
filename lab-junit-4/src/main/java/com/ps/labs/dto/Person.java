package com.ps.labs.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {

    private static final long serialVersionUID = -6099455057615875184L;

    private String lastName;
    private String firstName;
    private LocalDate birthDate;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(final LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
