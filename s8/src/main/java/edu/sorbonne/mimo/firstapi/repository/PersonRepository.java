package edu.sorbonne.mimo.firstapi.repository;

import edu.sorbonne.mimo.firstapi.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {

    Optional<Person> findById(String id);

    List<Person> findAll();

    void insert(Person person);

    void delete(String id);
}
