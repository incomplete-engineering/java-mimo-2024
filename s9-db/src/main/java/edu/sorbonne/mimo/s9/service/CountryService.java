package edu.sorbonne.mimo.s9.service;


import java.util.List;
import java.util.Optional;

import edu.sorbonne.mimo.s9.model.Country;

public interface CountryService {
    
    public List<Country> allCountries();

    Optional<Country> findById(Integer id);
}
