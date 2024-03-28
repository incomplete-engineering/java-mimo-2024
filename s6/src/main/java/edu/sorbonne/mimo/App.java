package edu.sorbonne.mimo;

import java.util.List;

import edu.sorbonne.mimo.model.Book;
import edu.sorbonne.mimo.repository.BookRepository;
import edu.sorbonne.mimo.repository.JsonBookRepositoryImpl;

public class App {
    public static void main(String[] args) {
        BookRepository bookRepository = new JsonBookRepositoryImpl("C:/Users/laabidi.raissi/work/mimo/java-mimo-2024/s6/src/main/resources");
        List<Book> books = bookRepository.findAll();
        for(Book book: books) {
            System.out.println(book.getTitle());
        }

        Book b = new Book();
        b.setIsbn("1234");
        b.setTitle("test");
        

        //bookRepository.saveBook(b);
    }
}
