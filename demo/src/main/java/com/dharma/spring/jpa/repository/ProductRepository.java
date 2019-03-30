package com.dharma.spring.jpa.repository;

import com.dharma.spring.jpa.model.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product,Long> {
    List<Product> findByName(String name);
//    @Query(value = "SELECT * FROM product where name = :name",nativeQuery = true)
//    List<Product> findAllByName(String name);

    Optional<Product> findById(Long id);
}
