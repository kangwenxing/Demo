package com.dharm.springmvc.service;

import com.dharm.springmvc.damain.Product;

import java.util.List;

public interface IpProductService {
    Product getProductById(long id);

    Product getProductByName(String name);

    void addProduct(Product product);

    void updateProduct(Product product);

    void deleteProductById(long id);

    List<Product> getProducts();

    void deleteAllProducts();

    public boolean isProductExist(Product product);
}
