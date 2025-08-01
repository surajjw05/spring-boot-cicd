package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from  Boot!";
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Application is running.";
    }
}
