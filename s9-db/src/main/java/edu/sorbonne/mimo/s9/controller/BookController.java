package edu.sorbonne.mimo.s9.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.sorbonne.mimo.s9.dto.NewBookReqDTO;
import edu.sorbonne.mimo.s9.dto.SearchBookRespDTO;
import edu.sorbonne.mimo.s9.model.Book;
import edu.sorbonne.mimo.s9.service.BookService;
import jakarta.validation.Valid;

@RestController
public class BookController {
    
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books/by-countries")
    public Map<String, List<SearchBookRespDTO>> byCountries() {
        return bookService.listBooksByCountries();
    }

    @PostMapping("/books")
    public String newBook(@RequestBody @Valid NewBookReqDTO creationReq) {
        bookService.saveNewBook(creationReq);
        return "Ok";
    }
}
