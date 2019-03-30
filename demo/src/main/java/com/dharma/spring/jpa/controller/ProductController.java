package com.dharma.spring.jpa.controller;

import com.dharma.spring.jpa.model.Product;
import com.dharma.spring.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public @ResponseBody  String welcome(){
        return "Welcome!";
    }
    @GetMapping("/product")
    public @ResponseBody
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/product/id/{id}")
    public @ResponseBody
    Product getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @GetMapping("/product/name/{name}")
    public @ResponseBody
    List<Product> getByName(@PathVariable String name){
        return productService.getByName(name);
    }

    @PostMapping("/product")
    public HttpStatus insertProduct(@RequestBody Product product){
        return productService.addProduct(product)?HttpStatus.CREATED:HttpStatus.BAD_REQUEST;
    }
    @DeleteMapping("/product/{id}")
    public HttpStatus deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return HttpStatus.NO_CONTENT;
    }

}
