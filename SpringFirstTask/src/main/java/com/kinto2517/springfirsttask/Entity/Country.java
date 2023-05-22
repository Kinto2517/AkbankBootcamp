package com.kinto2517.springfirsttask.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "president", nullable = false)
    private String president;


    public Country() {
    }

    public Country(Integer id, String name, String president) {
        this.id = id;
        this.name = name;
        this.president = president;
    }

    

}