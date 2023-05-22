package com.kinto2517.springfirsttask.Mapper;

import com.kinto2517.springfirsttask.Dto.CountryDto;
import com.kinto2517.springfirsttask.Entity.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDto countryToCountryDto(Country country);

    Country countryDtoToCountry(CountryDto countryDto);

    List<CountryDto> countryToCountryDto(List<Country> countries);

    List<Country> countryDtoToCountry(List<CountryDto> countryDtos);

}
