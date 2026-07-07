package com.cognizant.springdatajpahandson;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.springdatajpahandson.model.Country;
import com.cognizant.springdatajpahandson.service.CountryService;

@SpringBootApplication
public class SpringDataJpaHandsonApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpringDataJpaHandsonApplication.class, args);

        CountryService service = context.getBean(CountryService.class);

        // -------------------------------------------------
        // Query Method 1
        // Find countries containing "ou"
        // -------------------------------------------------

        System.out.println("\n===== Countries containing 'ou' =====");

        List<Country> countries = service.searchCountries("ou");

        for (Country country : countries) {
            System.out.println(country.getCode() + " - " + country.getName());
        }

        // -------------------------------------------------
        // Query Method 2
        // Find countries containing "ou" in ascending order
        // -------------------------------------------------

        System.out.println("\n===== Countries containing 'ou' (Ascending Order) =====");

        List<Country> sortedCountries =
                service.searchCountriesSorted("ou");

        for (Country country : sortedCountries) {
            System.out.println(country.getCode() + " - " + country.getName());
        }

        // -------------------------------------------------
        // Query Method 3
        // Countries starting with Z
        // -------------------------------------------------

        System.out.println("\n===== Countries starting with 'Z' =====");

        List<Country> zCountries =
                service.getCountriesStartingWith("Z");

        for (Country country : zCountries) {
            System.out.println(country.getCode() + " - " + country.getName());
        }

    }
}