package com.jumia.demo.controllers;

import com.jumia.demo.dto.CountryDTO;
import com.jumia.demo.services.ICountryService;
import com.jumia.demo.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
@CrossOrigin
public class CountryController {

    @Autowired
    private ICountryService countryServiceImpl;

    @GetMapping
    public List<CountryDTO> getAllCountries(){
        return countryServiceImpl.getAllCountries();
    }
}
