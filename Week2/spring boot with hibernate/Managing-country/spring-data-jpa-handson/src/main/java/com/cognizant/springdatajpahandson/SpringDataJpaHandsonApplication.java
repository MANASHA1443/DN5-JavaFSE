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

        // -----------------------------
        // Find Country
        // -----------------------------
        Country country = service.getCountry("IN");

        if (country != null) {
            System.out.println("Country Code : " + country.getCode());
            System.out.println("Country Name : " + country.getName());
        }

        // -----------------------------
        // Add Country
        // -----------------------------
        Country newCountry = new Country("JP", "Japan");

        service.addCountry(newCountry);

        System.out.println("Country Added Successfully");

        // -----------------------------
        // Update Country
        // -----------------------------
        service.updateCountry("JP", "Japan Updated");

        System.out.println("Country Updated Successfully");

        // -----------------------------
        // Delete Country
        // -----------------------------
        service.deleteCountry("JP");

        System.out.println("Country Deleted Successfully");

        // -----------------------------
        // Search Country
        // -----------------------------
        List<Country> countries = service.searchCountry("In");

        System.out.println("Countries Found:");

        for (Country c : countries) {
            System.out.println(c.getCode() + " - " + c.getName());
        }

    }
}