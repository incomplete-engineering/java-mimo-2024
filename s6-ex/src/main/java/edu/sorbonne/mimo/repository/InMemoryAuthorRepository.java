package edu.sorbonne.mimo.repository;

import edu.sorbonne.mimo.model.Author;

public class InMemoryAuthorRepository implements AuthorRepository {

    @Override
    public Author findByName(String name) {
        Author author = new Author();
        author.setName(name);
        author.setBio("Bio de test pour auteur: " + name);
        return author;
    }
    
}
