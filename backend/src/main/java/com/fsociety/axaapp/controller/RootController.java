package com.fsociety.axaapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RootController {

    @GetMapping("/")
    public Map<String, String> home() {

        return Map.of(
            "status", "ok",
            "message", "Spring Boot is working"
        );
    }
}
