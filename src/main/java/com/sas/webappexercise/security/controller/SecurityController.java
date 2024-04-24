package com.sas.webappexercise.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	@GetMapping
    public String home() {
        String result = "Hello";
        return result;
    }

    @GetMapping("/user")
    public String user() {
        return "Hello, User!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello, Admin!";
    }
}
