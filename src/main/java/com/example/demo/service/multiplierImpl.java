package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class multiplierImpl implements multiplier {
    @Override
    public int doMath(int a) {
        return a*5;
    }
}
