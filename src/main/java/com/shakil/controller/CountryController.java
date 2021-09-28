package com.shakil.controller;

import com.shakil.model.Country;
import com.shakil.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@AllArgsConstructor
public class CountryController {

    @Autowired
    private CountryService countryService;


    @GetMapping("/countries/all")
    public String allCountries(Model model) {
        model.addAttribute("countries", countryService.allCountries());
        return "/countries/show-all";
    }

    @GetMapping("/countries/add")
    public String addCountry(Model model) {
        model.addAttribute("country", new Country());
        return "/countries/add_country";
    }

    @PostMapping("/countries/add")
    public String addCountry(Model model, @ModelAttribute Country country) {
        countryService.save(country);
        return "redirect: /countries/all";
    }

    @GetMapping("/countries/details")
    public String showUser(Model model, @RequestParam("id") long id) {
        var countryEntity = countryService.getCountryById(id);
        model.addAttribute("country", countryEntity);
        model.addAttribute("pageTitle", "country details");
        return "countries/details";
    }

}
