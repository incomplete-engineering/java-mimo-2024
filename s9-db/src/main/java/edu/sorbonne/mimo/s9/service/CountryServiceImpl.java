package edu.sorbonne.mimo.s9.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.sorbonne.mimo.s9.model.Country;
import edu.sorbonne.mimo.s9.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> allCountries() {
        List<Country> result = new ArrayList<>();
        countryRepository.findAll()
                    .forEach(result::add);
        return result;
    }
    
}
