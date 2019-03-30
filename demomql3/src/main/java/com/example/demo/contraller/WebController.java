package com.example.demo.contraller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/web")
public class WebController {
    private static final Logger logger = LoggerFactory.getLogger(ApiCintroller.class);
    @RequestMapping
    public String index(ModelMap map){
        logger.info("web controller - homepage");
        map.put("title","FIRST BLOOD");
        if (rand()<5){
            throw new RuntimeException("命不好");
        }
        return "index";
    }
    @RequestMapping("/error")
    public String error(){
        final String errorInfo = "不行了吧";
        logger.error(errorInfo);
        throw new RuntimeException(errorInfo);
    }
    private int rand(){
        int rand = (int) (Math.random()*(10-1)+1);
        logger.info("Generater random number "+rand);
        return rand;
    }
}
