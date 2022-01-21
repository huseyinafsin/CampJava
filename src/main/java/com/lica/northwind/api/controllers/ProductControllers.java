package com.lica.northwind.api.controllers;

import com.lica.northwind.bussiness.abstracts.ProductService;
import com.lica.northwind.entities.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductControllers {

    private ProductService productService;

    @Autowired
    public ProductControllers(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Product> getAll(){
        return this.productService.getAll();
    }

}
