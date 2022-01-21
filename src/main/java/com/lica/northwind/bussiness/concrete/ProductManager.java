package com.lica.northwind.bussiness.concrete;

import com.lica.northwind.bussiness.abstracts.ProductService;
import com.lica.northwind.dataAccess.abstracts.ProductDao;
import com.lica.northwind.entities.concrete.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
