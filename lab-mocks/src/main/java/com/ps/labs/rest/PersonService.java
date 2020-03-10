package com.ps.labs.rest;

import java.util.List;
import java.util.Random;

import com.ps.labs.rest.dto.Person;
import com.ps.labs.rest.exceptions.BusinessException;

public class PersonService {

    public List<Person> findPeople() {
        throw new RuntimeException("Not implemented");
    }

    public Person findPerson(final long id) {
        throw new RuntimeException("Not implemented");
    }

    public Person createPerson(final Person person) throws BusinessException {
        if (person.getLastName() == null || person.getFirstName() == null) {
            throw new BusinessException("First name and last name are mandatory");
        }
        return new Person(new Random().nextLong(), person.getLastName(), person.getFirstName());
    }

}
