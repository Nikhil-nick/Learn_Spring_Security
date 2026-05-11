package com.security.spring.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class dummyController {

    @GetMapping("test")
    public String test(){
        return "Working Fine!!!";
    }
}
