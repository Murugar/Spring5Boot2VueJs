package com.iqmsoft.springbootvuejs.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Data
@Entity
@NoArgsConstructor
public class CountryLanguage implements Serializable{
    @Id
    @ManyToOne
    private Country country;

    @Id
    private String language;

    private Boolean isofficial;
    private Double percentage;
}
