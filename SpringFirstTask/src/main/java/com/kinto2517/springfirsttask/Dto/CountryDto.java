package com.kinto2517.springfirsttask.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class CountryDto {
    private Integer id;
    private String name;
    private String president;

}
