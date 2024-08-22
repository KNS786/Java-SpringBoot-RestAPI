package com.navani.ProductSpringWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

    public void addProduct(Product p){
        db.save(p);
    }

    public List<Product> getAllProducts(){
        return db.findAll();
    }

    public Product getProduct(String name) {
        return db.findByName(name);
    }
}

