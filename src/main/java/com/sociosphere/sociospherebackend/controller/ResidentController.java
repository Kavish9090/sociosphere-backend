package com.sociosphere.sociospherebackend.controller;

import com.sociosphere.sociospherebackend.entity.Resident;
import com.sociosphere.sociospherebackend.service.ResidentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<Resident>> getAllResidents() {

        return ResponseEntity.ok(residentService.getAllResidents());
    }

    @DeleteMapping("/{residentId}")
    public ResponseEntity<String> deleteResident(@PathVariable Long residentId) {

        residentService.deleteResident(residentId);

        return ResponseEntity.ok("Resident deleted successfully");
    }

    @PutMapping("/{residentId}")
    public ResponseEntity<String> updateResident(
            @PathVariable Long residentId,
            @RequestBody Resident resident) {

        residentService.updateResident(residentId, resident);

        return ResponseEntity.ok("Resident updated successfully");
    }
}