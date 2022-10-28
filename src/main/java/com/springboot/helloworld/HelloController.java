package com.springboot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/test")
    public String test(){
        return "Hi, Saswat your spring boot application has been successfully deployed to azure";
    }
    
}
