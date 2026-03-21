package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.klu.service.CalcService;
@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalcService service;

    // Addition - RequestParam
    // URL: http://localhost:8080/calculator/add?a=10&b=5
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return service.add(a, b);
    }

    // Subtraction - PathVariable
    // URL: http://localhost:8080/calculator/subtractor/20/5
    @GetMapping("/subtractor/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return service.subtract(a, b);
    }

    // Multiplication - PathVariable
    // URL: http://localhost:8080/calculator/multiply/20/5
    @GetMapping("/multiply/{a}/{b}")
    public int multiply(@PathVariable int a, @PathVariable int b) {
        return service.multiply(a, b);
    }

    // Division - RequestParam
    // URL: http://localhost:8080/calculator/division?a=20&b=5
    @GetMapping("/division")
    public double divide(@RequestParam int a, @RequestParam int b) {
        return service.divide(a, b);
    }

    // Modulo - PathVariable
    // URL: http://localhost:8080/calculator/modulo/20/5
    @GetMapping("/modulo/{a}/{b}")
    public int modulo(@PathVariable int a, @PathVariable int b) {
        return service.modulo(a, b);
    }
} 
