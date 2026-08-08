package com.sociosphere.sociospherebackend.controller;

import com.sociosphere.sociospherebackend.entity.Resident;
import com.sociosphere.sociospherebackend.service.ResidentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/residents")
public class ResidentController {

    private final ResidentService residentService;

    public ResidentController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @PostMapping
    public ResponseEntity<String> saveResident(@RequestBody Resident resident) {

        residentService.saveResident(resident);

        return ResponseEntity.ok("Resident saved successfully");
    }
}
