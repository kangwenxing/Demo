package com.example.demo.contraller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


@RestController
@RequestMapping("/api")
public class ApiCintroller {
    private static final Logger logger = LoggerFactory.getLogger(ApiCintroller.class);

    @PostMapping("/hello")
    public HashMap<String,Object> hello(@RequestParam String name){
        HashMap<String,Object> model = new HashMap<>();
        model.put("action","hello");
        model.put("name","Dr. "+ name) ;
        return model;
    }
}
