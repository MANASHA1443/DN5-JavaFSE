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

    // Find country by code
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    // Add new country
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // Update country
    public void updateCountry(Country country) {
        countryRepository.save(country);
    }

    // Delete country
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    // Query Method 1
    public List<Country> searchCountries(String text) {
        return countryRepository.findByNameContainingIgnoreCase(text);
    }

    // Query Method 2
    public List<Country> searchCountriesSorted(String text) {
        return countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc(text);
    }

    // Query Method 3
    public List<Country> getCountriesStartingWith(String letter) {
        return countryRepository.findByNameStartingWithIgnoreCase(letter);
    }
}