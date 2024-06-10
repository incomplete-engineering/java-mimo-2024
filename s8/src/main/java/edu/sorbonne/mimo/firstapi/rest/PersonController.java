package edu.sorbonne.mimo.firstapi.rest;

import edu.sorbonne.mimo.firstapi.model.Person;
import edu.sorbonne.mimo.firstapi.service.PersonService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class PersonController {

    private  PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons/{id}")
    public Person get(@PathVariable String id) {
        return personService.get(id);
    }

    
    @GetMapping("/persons")
    public List<Person> search(@RequestParam(required = false) String name) {
        if(name == null || name.isBlank()) {
            return personService.getAll(); 
        }
        return personService.byName(name);
    }
    

    @GetMapping("/cities")
    public List<String> cities() {
        return personService.allCities();
    }

    @GetMapping("/cities/v2")
    public Set<String> citiesV2() {
        return personService.uniqueCities();
    }

    @GetMapping("/cities/populations")
    public Map<String, Integer> populations() {
        return personService.populations();
    }



    //Add a person:
    @PostMapping("/persons")
    public String insert(@RequestBody Person person) {
        personService.save(person);
        return "Ok";
    }

    //Delete a person by id:
    @DeleteMapping("/persons/{id}")
    public void delete(@PathVariable String id) {
        personService.delete(id);
    }

}
