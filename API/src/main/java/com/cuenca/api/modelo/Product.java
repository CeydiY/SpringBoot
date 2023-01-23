package com.cuenca.api.modelo;


import lombok.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private float price;
}

