package com.converge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//health check to check server status (GET)
@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "Converge is running";
    }

}