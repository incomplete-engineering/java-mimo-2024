package edu.sorbonne.mimo.firstapi.service;

import edu.sorbonne.mimo.firstapi.model.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface PersonService {

    Person get(String id);

    List<Person> getAll();

    List<Person> byName(String name);

    List<String> allCities();

    Set<String> uniqueCities();

    Map<String, Integer> populations();

    void save(Person person);

    void delete(String id);
}
