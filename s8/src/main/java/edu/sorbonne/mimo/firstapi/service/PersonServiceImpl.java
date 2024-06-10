package edu.sorbonne.mimo.firstapi.service;

import edu.sorbonne.mimo.firstapi.model.Person;
import edu.sorbonne.mimo.firstapi.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person get(String id) {
        return personRepository.findById(id);
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> byName(String name) {
        List<Person> allPersons = personRepository.findAll();
        List<Person> filtered = new ArrayList<>();
        for(Person person: allPersons) {
            if(person.getFirstName().equals(name) || person.getLastName().equals(name)) {
                filtered.add(person);
            }
        }
        return filtered;
    }

    @Override
    public List<String> allCities() { 
        List<String> cities = new ArrayList<>();
        List<Person> allPersons = personRepository.findAll();
        for(Person person: allPersons) {
            cities.add(person.getCity());
        }
        return cities;
    }

    
    @Override
    public Set<String> uniqueCities() { 
        Set<String> cities = new HashSet<>();
        List<Person> allPersons = personRepository.findAll();
        for(Person person: allPersons) {
            cities.add(person.getCity());
        }
        return cities;
    }

    @Override
    public Map<String, Integer> populations() {
        List<Person> allPersons = personRepository.findAll();
        Map<String, Integer> populations = new HashMap<>();
        for (Person person : allPersons) {
            String city = person.getCity();
            Integer count = populations.get(city);
            if(count == null) {
                count = 0;
            }
            count += 1;
            populations.put(city, count);
        }
        return populations;
    }

    @Override
    public void save(Person person) {
        personRepository.insert(person);
    }

    @Override
    public void delete(String id) {
        personRepository.delete(id);
    }
    
}
