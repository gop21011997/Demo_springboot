package com.Demo_springboot.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan
public class HomeController {
    @GetMapping("/home")
    public String Home(){

        return "This is my Home page";
    }
}
