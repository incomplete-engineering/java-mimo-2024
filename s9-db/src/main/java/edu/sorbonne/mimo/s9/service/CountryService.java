package edu.sorbonne.mimo.s9.service;


import java.util.List;

import org.springframework.stereotype.Service;

import edu.sorbonne.mimo.s9.model.Country;

@Service
public interface CountryService {
    
    public List<Country> allCountries();
}
