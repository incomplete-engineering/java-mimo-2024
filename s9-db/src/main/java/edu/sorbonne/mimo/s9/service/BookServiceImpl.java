package edu.sorbonne.mimo.s9.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.sorbonne.mimo.s9.dto.NewBookReqDTO;
import edu.sorbonne.mimo.s9.dto.SearchBookRespDTO;
import edu.sorbonne.mimo.s9.model.Author;
import edu.sorbonne.mimo.s9.model.Book;
import edu.sorbonne.mimo.s9.model.Country;
import edu.sorbonne.mimo.s9.repository.AuthorRepository;
import edu.sorbonne.mimo.s9.repository.BookRepository;
import edu.sorbonne.mimo.s9.repository.CountryRepository;
import jakarta.transaction.Transactional;

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
    public Map<String, List<SearchBookRespDTO>> listBooksByCountries() {
        Map<String, List<SearchBookRespDTO>> booksByCountry = new HashMap<>();
        for(Country country: countryRepository.findAll()) {
            List<Book> books = bookRepository.findByAuthorCountryName(country.getName());
            List<SearchBookRespDTO> dtos = new ArrayList<>();
            for (Book book : books) {
                SearchBookRespDTO dto = new SearchBookRespDTO();
                dto.setIsbn(book.getIsbn());
                dto.setTitle(book.getTitle());
                dtos.add(dto);
            }
            booksByCountry.put(country.getName(), dtos);
        }
        return booksByCountry;
    }

    @Override
    //@Transactional
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


    public void updateAuthor(Integer authorId) {
        System.out.println("Adding book to author: " + authorId);
        if(authorId.equals(2)) {
            throw new RuntimeException("Author can not have new books. Id: " + authorId);
        }
        //....
        System.out.println("Author books updated");
    }

}
