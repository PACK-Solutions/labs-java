package com.ps.labs.rest.dto;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 28408055838345631L;

    private final Long id;
    private final String lastName;
    private final String firstName;

    public Person() {
        this.id = null;
        this.lastName = null;
        this.firstName = null;
    }

    public Person(final Long id, final String lastName, final String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}
