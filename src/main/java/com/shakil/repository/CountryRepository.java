package com.shakil.repository;

import com.shakil.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface CountryRepository extends JpaRepository<Country, Long> {

    @Query("select c from Country c")
    List<Country> allCountries();

    Country getCountryById(Long id);
}
