package com.iqmsoft.springbootvuejs.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
@NoArgsConstructor
public class City {
    @Id
    private Integer id;
    private String name;

    /*@ManyToOne
    @JoinColumn(name = "countrycode")*/
    //private Country country;
    private String countrycode;

    private String district;
    private Integer population;
}
