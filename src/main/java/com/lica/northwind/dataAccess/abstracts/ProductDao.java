package com.lica.northwind.dataAccess.abstracts;

import com.lica.northwind.entities.concrete.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
