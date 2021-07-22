package com.kindsonthegenius.fleetapp.services;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //return list of Countries
    public List<Country> getCountries() {
            return countryRepository.findAll();
    }
}
