package com.sociosphere.sociospherebackend.service;

import com.sociosphere.sociospherebackend.entity.Resident;
import com.sociosphere.sociospherebackend.repository.ResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentServiceImpl implements ResidentService {

    @Autowired
    private ResidentRepository residentRepository;

    @Override
    public void saveResident(Resident resident) {
        residentRepository.save(resident);
    }

    @Override
    public List<Resident> getAllResidents() {
        return residentRepository.findAll();
    }

    @Override
    public void deleteResident(Long residentId) {
        residentRepository.deleteById(residentId);
    }

    @Override
    public void updateResident(Long residentId, Resident resident) {

        Resident existingResident = residentRepository.findById(residentId)
                .orElseThrow(() -> new RuntimeException("Resident not found"));

        existingResident.setFullName(resident.getFullName());
        existingResident.setEmail(resident.getEmail());
        existingResident.setPhoneNumber(resident.getPhoneNumber());
        existingResident.setFlatNumber(resident.getFlatNumber());

        residentRepository.save(existingResident);
    }

    @Override
    public Resident getResidentById(Long residentId) {
        return residentRepository.findById(residentId)
                .orElseThrow(() -> new RuntimeException("Resident not found"));
    }
}