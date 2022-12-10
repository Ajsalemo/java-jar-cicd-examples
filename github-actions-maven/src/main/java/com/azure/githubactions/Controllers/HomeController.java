package com.azure.githubactions.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Hello from Spring Boot with GitHub Actions and Maven";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
