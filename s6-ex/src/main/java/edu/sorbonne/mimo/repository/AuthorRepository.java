package edu.sorbonne.mimo.repository;

import edu.sorbonne.mimo.model.Author;

public interface AuthorRepository {
    
    Author findByName(String name);
}
