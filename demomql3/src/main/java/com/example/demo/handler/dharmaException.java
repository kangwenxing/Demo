package com.example.demo.handler;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice

public class dharmaException {

    @ExceptionHandler({ RuntimeException.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(RuntimeException exception){

        ModelAndView mo =new ModelAndView( );
        mo.addObject("dharmaException",exception.getMessage());
        mo.setViewName("error/500");
        return mo;

    }@ExceptionHandler({ Exception.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(Exception exception){

        ModelAndView mo =new ModelAndView( );
        mo.addObject("dharmaException",exception.getMessage());
        mo.setViewName("error/5xx");
        return mo;

    }
}
