package edu.sorbonne.mimo.firstapi.rest;

import edu.sorbonne.mimo.firstapi.model.Person;
import edu.sorbonne.mimo.firstapi.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<Person> getAll() {
        return personService.getAll();
    }
    @GetMapping("/persons/{id}")
    public Person get(@PathVariable String id) {
        return personService.get(id);
    }

}
