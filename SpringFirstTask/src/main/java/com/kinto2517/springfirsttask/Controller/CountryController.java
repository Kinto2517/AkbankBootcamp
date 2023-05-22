package com.kinto2517.springfirsttask.Controller;

import com.kinto2517.springfirsttask.Dto.CountryDto;
import com.kinto2517.springfirsttask.Entity.Country;
import com.kinto2517.springfirsttask.Mapper.CountryMapper;
import com.kinto2517.springfirsttask.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/country")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CountryMapper countryMapper;

    @PostMapping(path = "/add")
    public ResponseEntity<CountryDto> addCountry(@RequestBody CountryDto countryDto) {
        Country country = countryMapper.countryDtoToCountry(countryDto);
        countryRepository.save(country);
        return ResponseEntity.ok(countryDto);
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<CountryDto>> getAllCountries() {
        List<Country> countries = countryRepository.findAll();
        List<CountryDto> countryDtos = countryMapper.countryToCountryDto(countries);
        return ResponseEntity.ok(countryDtos);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CountryDto> getCountryById(@PathVariable("id") Integer id) {
        Country country = countryRepository.findById(id).orElse(null);
        CountryDto countryDto = countryMapper.countryToCountryDto(country);
        return ResponseEntity.ok(countryDto);
    }

    @PutMapping(path = "/{id}/update-president")
    public ResponseEntity<CountryDto> updateCountryPresident(@PathVariable("id") Integer id, @RequestBody String president) {
        Country country = countryRepository.findById(id).orElse(null);
        if (country == null) {
            return ResponseEntity.notFound().build();
        }
        country.setPresident(president);
        countryRepository.save(country);
        CountryDto countryDto = countryMapper.countryToCountryDto(country);
        return ResponseEntity.ok(countryDto);
    }


}
