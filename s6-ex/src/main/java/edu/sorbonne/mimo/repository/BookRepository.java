package edu.sorbonne.mimo.repository;

import java.util.List;

import edu.sorbonne.mimo.model.Book;

public interface BookRepository {

    Book getBook(String isbn);
}
