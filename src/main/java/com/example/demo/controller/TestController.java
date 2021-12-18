package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${app.env}")
    private String envType;

    @GetMapping("test")
    public String test() {
        return "Hello World";
    }

    @GetMapping("config")
    public String getConfig() {
        return "ENV_TYPE:" + envType;
    }
}
