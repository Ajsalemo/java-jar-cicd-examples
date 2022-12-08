package com.devops.azure.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "Hello from Spring Boot with Azure DevOps and Gradle";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
