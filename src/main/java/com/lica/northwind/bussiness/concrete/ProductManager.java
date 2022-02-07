package com.lica.northwind.bussiness.concrete;

import com.lica.northwind.bussiness.abstracts.ProductService;
import com.lica.northwind.core.utities.results.DataResult;
import com.lica.northwind.core.utities.results.Result;
import com.lica.northwind.core.utities.results.SuccessDataResult;
import com.lica.northwind.core.utities.results.SuccessResult;
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
    public DataResult<List<Product>>  getAll() {
        return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi") ;
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }
}
