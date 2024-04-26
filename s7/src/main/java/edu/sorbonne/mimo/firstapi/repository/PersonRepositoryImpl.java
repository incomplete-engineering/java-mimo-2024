package edu.sorbonne.mimo.firstapi.repository;

import edu.sorbonne.mimo.firstapi.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository {
    @Override
    public Person findById(String id) {
        String firstName = "first-" + id;
        String lastName = "last-" + id;
        Person result = new Person();
        result.setId(id);
        result.setFirstName(firstName);
        result.setLastName(lastName);
        result.setCity("city1");
        return result;
    }

    @Override
    public List<Person> findAll() {
        List<Person> allPersons = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            String id = "id-" + i;
            String firstName = "first-" + id;
            String lastName = "last-" + id;
            Person person = new Person();
            person.setId(id);
            person.setFirstName(firstName);
            person.setLastName(lastName);
            String city;
            if(i % 2 == 0) {
                city = "A";
            } else {
                city = "B";
            }
            person.setCity(city);
            allPersons.add(person);
        }
        return allPersons;
    }
}
