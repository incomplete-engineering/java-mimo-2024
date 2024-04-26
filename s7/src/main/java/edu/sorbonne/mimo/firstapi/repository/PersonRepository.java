package edu.sorbonne.mimo.firstapi.repository;

import edu.sorbonne.mimo.firstapi.model.Person;

import java.util.List;

public interface PersonRepository {

    Person findById(String id);

    List<Person> findAll();
}
