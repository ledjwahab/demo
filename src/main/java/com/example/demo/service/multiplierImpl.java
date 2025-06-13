package com.example.demo.service;

import com.example.demo.model.product;
import org.springframework.stereotype.Service;

@Service
public class multiplierImpl implements multiplier {
    @Override
    public product doTimesFive(int a) {
        product result = new product();
        result.setResult(String.valueOf(a*5));
        result.setMultiplicand("5");
        return result;
    }
}
