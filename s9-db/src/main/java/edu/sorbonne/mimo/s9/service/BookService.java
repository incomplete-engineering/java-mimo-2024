package edu.sorbonne.mimo.s9.service;

import java.util.List;
import java.util.Map;

import edu.sorbonne.mimo.s9.dto.NewBookReqDTO;
import edu.sorbonne.mimo.s9.model.Book;

public interface BookService {
    
    Map<String, List<Book>> listBooksByCountries();

    void saveNewBook(NewBookReqDTO creationReq);
}
