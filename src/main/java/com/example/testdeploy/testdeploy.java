package com.example.testdeploy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testdeploy {

    @GetMapping("/")
    public String getHome(){
        return "ดีครับอิอิ" ;
    }
}
