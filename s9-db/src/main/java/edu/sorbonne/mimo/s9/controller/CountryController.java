package edu.sorbonne.mimo.s9.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
}
