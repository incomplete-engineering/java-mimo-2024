package edu.sorbonne.mimo.s9.repository;

import org.springframework.data.repository.CrudRepository;

import edu.sorbonne.mimo.s9.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
    
}
