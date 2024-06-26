package edu.sorbonne.mimo.s9.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.sorbonne.mimo.s9.model.Country;
import edu.sorbonne.mimo.s9.service.CountryService;

@RestController
public class CountryController {
    
    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public List<Country> allCountries() {
        return countryService.allCountries();   
    }

    @GetMapping("/countries/{id}")
    public ResponseEntity<Country> byId(@PathVariable Integer id) {
        return countryService.findById(id)
                .map(country -> ResponseEntity.ok().body(country))
                .orElseGet(() -> ResponseEntity.notFound().build());   
    }

}
