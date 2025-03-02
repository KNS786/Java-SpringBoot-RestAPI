package com.navani.ProductSpringWeb;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Product {

    @Id
    private int id;
    private String name;
    private String type;
    private String place;
    private int warranty;

    public Product(){}

    public Product(String name, String type, String place, int warranty){
        this.name = name;
        this.type = type;
        this.place = place;
        this.warranty = warranty;
    }
}
