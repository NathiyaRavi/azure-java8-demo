package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Application {

    @GetMapping("/")
    public String hello() {
        return "Hello from Java 8 app running on Azure App Service!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
