package com.lica.northwind.bussiness.abstracts;

import com.lica.northwind.core.utities.results.DataResult;
import com.lica.northwind.core.utities.results.Result;
import com.lica.northwind.entities.concrete.Product;

import java.util.List;

public interface ProductService {
   DataResult<List<Product>>  getAll();
   Result add(Product product);
}
