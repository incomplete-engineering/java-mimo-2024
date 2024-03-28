package edu.sorbonne.mimo.repository;

import java.util.ArrayList;
import java.util.List;

import edu.sorbonne.mimo.model.Book;
import edu.sorbonne.mimo.utils.CsvFileReader;

public class CsvBookRepositoryImpl implements BookRepository {

    private String booksFile;

    public CsvBookRepositoryImpl(String dataFolder) {
        this.booksFile = dataFolder + "/books.csv";
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        List<List<String>> csvRecords = CsvFileReader.parse(booksFile);
        for (List<String> csvRecord : csvRecords) {
            Book book = new Book();
            book.setIsbn(csvRecord.get(0));
            book.setTitle(csvRecord.get(1));
            books.add(book);
        }
        return books;
    }

    @Override
    public Book saveBook(Book book) {
        List<String> csvRecord = new ArrayList<>();
        csvRecord.add(book.getIsbn());
        csvRecord.add(book.getTitle());
        CsvFileReader.append(booksFile, csvRecord);
        return book;
    }
    
}
