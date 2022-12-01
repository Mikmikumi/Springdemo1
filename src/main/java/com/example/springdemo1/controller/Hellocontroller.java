package com.example.springdemo1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(String nickname){
        return "hello"+nickname;
    }


}
