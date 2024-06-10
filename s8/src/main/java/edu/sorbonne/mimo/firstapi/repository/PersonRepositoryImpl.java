package edu.sorbonne.mimo.firstapi.repository;

import edu.sorbonne.mimo.firstapi.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

    private List<Person> allPersons;

    public PersonRepositoryImpl() {
        allPersons = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            String id = "id-" + i;
            String firstName = "first-" + id;
            String lastName = "last-" + id;
            Person person = new Person();
            person.setId(id);
            person.setFirstName(firstName);
            person.setLastName(lastName);
            String city;
            if (i % 2 == 0) {
                city = "A";
            } else {
                city = "B";
            }
            person.setCity(city);
            allPersons.add(person);
        }
    }

    @Override
    public Person findById(String id) { // This is the old java style
        for (Person person : allPersons) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;//Bad very bad
    }

    @Override
    public List<Person> findAll() {
        return allPersons;
    }

    @Override
    public void insert(Person person) {
        allPersons.add(person);
    }

    // Java modern style:
    public Optional<Person> findByIdModern(String id) { // avoid nulls
        return allPersons.stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    @Override
    public void delete(String id) {
        allPersons = allPersons.stream()
                .filter(person -> !person.getId().equals(id))
                .toList();
    }
}
