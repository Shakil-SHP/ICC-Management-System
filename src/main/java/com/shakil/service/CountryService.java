package com.shakil.service;

import com.shakil.config.HibernateConfig;
import com.shakil.model.Country;
import com.shakil.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryService {


    private final CountryRepository countryRepository;


    public List<Country> allCountries() {
        return countryRepository.allCountries();
    }

    public void save(Country country) {
        countryRepository.save(country);
    }


    public Country getCountryById(long id) {
//        var criteriaBuilder = hibernateConfig.getCriteriaBuilder();
//        var criteriaQuery = criteriaBuilder.createQuery(Country.class);
//        var root = criteriaQuery.from(Country.class);
//        criteriaQuery.select(root);
//        criteriaQuery.where(criteriaBuilder.equal(root.get("id"), id));

        return countryRepository.getCountryById(id);
    }


}
