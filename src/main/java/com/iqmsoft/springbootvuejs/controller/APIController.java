package com.iqmsoft.springbootvuejs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.springbootvuejs.entity.Country;
import com.iqmsoft.springbootvuejs.repository.CountryRepository;


@RestController
@RequestMapping("/api")
public class APIController {
    @Autowired
    CountryRepository countryRepo;

    @GetMapping("/countries")
    public Page<Country> getCountries(Pageable pageable,
                                      @RequestParam(name="search", required=false, defaultValue="") String search){
        return countryRepo.findByNameContainingOrderByCode(search, pageable);
    }
}
