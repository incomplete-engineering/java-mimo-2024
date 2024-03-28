package s5.repository;

import java.util.List;

import s5.model.Book;

public interface BookRepository {
    
    List<Book> findByTile(String title);

    Book findByIsbn(String isbn);

    Book saveBook(Book book);
}
