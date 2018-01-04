package com.iqmsoft.springbootvuejs.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String code;
    private String name;
    private String continent;
    private String region;

    @OneToOne()
    @JoinColumn(name = "capital" )
    private City capital;
}
