package com.example.demo.controller;

import com.example.demo.service.multiplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class sampleEndPoint {
    @Autowired
    multiplier multiplier;

    @GetMapping("/multiply/{num}")
    public int doMath(@PathVariable int num){
        int res = multiplier.doMath(num);
        System.out.println("i was here");
        return res;
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

}
