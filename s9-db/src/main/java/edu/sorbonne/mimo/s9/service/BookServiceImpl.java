package edu.sorbonne.mimo.s9.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.sorbonne.mimo.s9.dto.NewBookReqDTO;
import edu.sorbonne.mimo.s9.model.Author;
import edu.sorbonne.mimo.s9.model.Book;
import edu.sorbonne.mimo.s9.model.Country;
import edu.sorbonne.mimo.s9.repository.AuthorRepository;
import edu.sorbonne.mimo.s9.repository.BookRepository;
import edu.sorbonne.mimo.s9.repository.CountryRepository;

@Service
public class BookServiceImpl implements BookService {
    
    private final BookRepository bookRepository;
    private final CountryRepository countryRepository;
    private final AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRepository, 
                            CountryRepository countryRepository, 
                            AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.countryRepository = countryRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public Map<String, List<Book>> listBooksByCountries() {
        Map<String, List<Book>> booksByCountry = new HashMap<>();
        for(Country country: countryRepository.findAll()) {
            List<Book> books = bookRepository.findByAuthorCountryName(country.getName());
            booksByCountry.put(country.getName(), books);
        }
        return booksByCountry;
    }

    @Override
    public void saveNewBook(NewBookReqDTO creationReq) {
        Optional<Author> optionalAuthor = authorRepository.findById(creationReq.getAuthorId());

        Author author = optionalAuthor
            .orElseThrow(() -> new RuntimeException("No author in DB with id: " + creationReq.getAuthorId()));
        
        Book toSave = new Book();
        toSave.setAuthor(author);
        toSave.setIsbn(creationReq.getIsbn());
        toSave.setTitle(creationReq.getTitle());
        toSave.setDescription(creationReq.getDescription());

        bookRepository.save(toSave);
    }

}
