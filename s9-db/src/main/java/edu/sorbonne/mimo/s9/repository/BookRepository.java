package edu.sorbonne.mimo.s9.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import edu.sorbonne.mimo.s9.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
    
    //@EntityGraph(attributePaths = {"author"})
    List<Book> findByAuthorCountryName(String name);

}
