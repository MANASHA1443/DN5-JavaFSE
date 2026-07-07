package com.cognizant.springdatajpahandson.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springdatajpahandson.model.Country;
import com.cognizant.springdatajpahandson.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Find Country
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    // Add Country
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // Update Country
    public void updateCountry(String code, String newName) {

        Country country = countryRepository.findById(code).orElse(null);

        if (country != null) {
            country.setName(newName);
            countryRepository.save(country);
        }
    }

    // Delete Country
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    // Search Country
    public List<Country> searchCountry(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }

}