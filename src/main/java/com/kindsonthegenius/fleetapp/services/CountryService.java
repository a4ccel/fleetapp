package com.kindsonthegenius.fleetapp.services;

import com.kindsonthegenius.fleetapp.models.Country;
import com.kindsonthegenius.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //return list of Countries
    public List<Country> getCountries() {
            return countryRepository.findAll();
    }


    //Save new country.js.js
    public void save(Country country) {
        countryRepository.save(country);
    }

    //get by id
    public Optional<Country> findById(int id) {
        return countryRepository.findById(id);
    }
}
