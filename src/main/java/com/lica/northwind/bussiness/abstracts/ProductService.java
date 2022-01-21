package com.lica.northwind.bussiness.abstracts;

import com.lica.northwind.entities.concrete.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

}
