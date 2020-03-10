package com.ps.labs.rest;

import java.util.List;

import com.ps.labs.rest.dto.Person;
import com.ps.labs.rest.exceptions.BusinessException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/person", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PersonController {

    private final PersonService service;

    @Autowired
    public PersonController(final PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Person> findPeople() {
        return service.findPeople();
    }

    @GetMapping(value = "{id}")
    public Person findPerson(@PathVariable final long id) {
        return service.findPerson(id);
    }

    @PostMapping
    public ResponseEntity<Person> createPeople(@RequestBody final Person person) {
        HttpStatus status;
        Person createdPerson = null;
        try {
            status = HttpStatus.OK;
            createdPerson = service.createPerson(person);
        } catch (BusinessException e) {
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(createdPerson, status);
    }

}
