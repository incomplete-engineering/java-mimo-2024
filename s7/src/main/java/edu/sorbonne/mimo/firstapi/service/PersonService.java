package edu.sorbonne.mimo.firstapi.service;

import edu.sorbonne.mimo.firstapi.model.Person;

import java.util.List;

public interface PersonService {

    Person get(String id);

    List<Person> getAll();

    List<Person> byName(String name);

    List<String> allCities();

    //Set<String> uniqueCities();
}
