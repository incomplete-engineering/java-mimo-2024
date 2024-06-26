package edu.sorbonne.mimo.s9.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.sorbonne.mimo.s9.model.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
 
    List<Country> findAllByOrderByNameAsc();
}
