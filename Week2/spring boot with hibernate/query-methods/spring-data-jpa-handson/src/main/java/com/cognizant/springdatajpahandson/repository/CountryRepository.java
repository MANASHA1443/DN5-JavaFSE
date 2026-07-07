package com.cognizant.springdatajpahandson.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.springdatajpahandson.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Find countries containing the given text
    List<Country> findByNameContainingIgnoreCase(String text);

    // Find countries containing the given text in ascending order
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String text);

    // Find countries starting with the given letter
    List<Country> findByNameStartingWithIgnoreCase(String letter);

}