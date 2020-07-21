package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository <Product, Integer>{
    @Override
    Product save(Product product);

    @Override
    void delete(Product entity);
}