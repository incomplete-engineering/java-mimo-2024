package edu.sorbonne.mimo.repository;

import edu.sorbonne.mimo.model.Book;

public class InMemoryBookRepository implements BookRepository {

    @Override
    public Book getBook(String isbn) {
        // Pour que cette méthode marche, il faut décommenter les lignes suivantes, et supprimer la dernière ligne qui commence par "throw new..."
        
        /*
        Book book = new Book();
        book.setIsbn(isbn);
        book.setTitle("Livre de test, isbn: " + isbn);
        book.setAuthorName("Auteur de test");
        return book;
        */
        
        throw new UnsupportedOperationException("Unimplemented method 'getBook'");
    }
    
}
