package edu.sorbonne.mimo.service;

import edu.sorbonne.mimo.api.BookAndAuthorDto;
import edu.sorbonne.mimo.model.Author;
import edu.sorbonne.mimo.model.Book;
import edu.sorbonne.mimo.repository.AuthorRepository;
import edu.sorbonne.mimo.repository.BookRepository;
import edu.sorbonne.mimo.repository.InMemoryAuthorRepository;
import edu.sorbonne.mimo.repository.InMemoryBookRepository;

public class BookManager {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public BookManager() {
        bookRepository = new InMemoryBookRepository();
        //authorRepository = new InMemoryAuthorRepository();
    }

    public BookAndAuthorDto getBook(String isbn) {
        Book book = bookRepository.getBook(isbn);
        //On aura une exception NullPointerException ici, pour la fixer, décommenter l'initialisation du champs authorRepository dans le constructeur
        Author author = authorRepository.findByName(book.getAuthorName());
        BookAndAuthorDto result = new BookAndAuthorDto(book, author);
        return result;
    }

}
