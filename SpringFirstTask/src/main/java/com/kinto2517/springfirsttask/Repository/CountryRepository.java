package com.kinto2517.springfirsttask.Repository;

import com.kinto2517.springfirsttask.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}