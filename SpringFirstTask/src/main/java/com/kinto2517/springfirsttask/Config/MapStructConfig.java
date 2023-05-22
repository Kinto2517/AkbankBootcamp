package com.kinto2517.springfirsttask.Config;

import com.kinto2517.springfirsttask.Mapper.CountryMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapStructConfig {

    @Bean
    public CountryMapper countryMapper() {
        return CountryMapper.INSTANCE;
    }

}
