package edu.sorbonne.mimo.repository;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

import edu.sorbonne.mimo.model.Book;

public class JsonBookRepositoryImpl implements BookRepository {

    private final ObjectMapper objectMapper = JsonMapper.builder()
            .enable(SerializationFeature.INDENT_OUTPUT)
            //.serializationInclusion(JsonInclude.Include.NON_NULL)
            //.disable(MapperFeature.DEFAULT_VIEW_INCLUSION)
            .build();

    private String booksFile;

    private List<Book> inMemoryBooks = new ArrayList<>();

    public JsonBookRepositoryImpl(String dataFolder) {
        this.booksFile = dataFolder + "/books.json";
        this.inMemoryBooks.addAll(findAll());
    }
            
    @Override
    public List<Book> findAll() {
        try{
            FileInputStream jsonInput = new FileInputStream(booksFile);
            List<Book> books = objectMapper.readValue(jsonInput, objectMapper.getTypeFactory().constructCollectionType(List.class, Book.class));
            return new ArrayList<>(books);
        } catch(Exception e) {
            System.out.println("Problem reading json books");
            e.printStackTrace();
            return List.of();
        }
    }

    @Override
    public Book saveBook(Book book) {
        inMemoryBooks.add(book);
        try{
            objectMapper.writeValue(new File(booksFile), inMemoryBooks);
        } catch(Exception e) {
            System.out.println("Problem saving json books");
            e.printStackTrace();
        }
        return book;
    }
    
}
