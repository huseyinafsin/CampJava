package com.lica.northwind.api.controllers;

import com.lica.northwind.bussiness.abstracts.ProductService;
import com.lica.northwind.core.utities.results.DataResult;
import com.lica.northwind.core.utities.results.Result;
import com.lica.northwind.core.utities.results.SuccessDataResult;
import com.lica.northwind.entities.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public DataResult<List<Product>> getAll(){
        return  this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }
}
