package com.sociosphere.sociospherebackend.controller;

import com.sociosphere.sociospherebackend.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private ResidentService residentService;

    @GetMapping("/")
    public String home() {
        return "Welcome to SocioSphere";
    }

    @GetMapping("/about")
    public String about() {
        return "SocioSphere - Smart Society Management System";
    }
}   