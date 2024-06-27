package edu.sorbonne.mimo.s9.service;

import java.util.List;
import java.util.Map;

import edu.sorbonne.mimo.s9.dto.NewBookReqDTO;
import edu.sorbonne.mimo.s9.dto.SearchBookRespDTO;

public interface BookService {
    
    Map<String, List<SearchBookRespDTO>> listBooksByCountries();

    void saveNewBook(NewBookReqDTO creationReq);
}
