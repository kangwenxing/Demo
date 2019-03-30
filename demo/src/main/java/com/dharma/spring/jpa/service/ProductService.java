package com.dharma.spring.jpa.service;


import com.dharma.spring.jpa.model.Product;
import com.dharma.spring.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {
    @Autowired


    ProductRepository productRepository ;
    public List<Product> getAllProducts(){

        return (List<Product>) productRepository.findAll();
    }

    public Product getProductById(Long id){

        return productRepository.findOne(id);
    }

    public List<Product> getByName(String name){
        return productRepository.findByName(name);
    }

    public boolean addProduct(Product product){
        return productRepository.save(product) != null;
    }
    @Transactional
    public void deleteProduct(Long productId){
         productRepository.delete(productId);
    }


}
