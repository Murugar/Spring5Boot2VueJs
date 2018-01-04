package com.iqmsoft.springbootvuejs.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.iqmsoft.springbootvuejs.entity.Country;


public interface CountryRepository extends JpaRepository<Country, String> {
    public Page<Country> findByNameContainingOrderByCode(String name, Pageable pageable);
}
