package com.example.endsemskill;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "EndsemSkill microservice is running successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}
