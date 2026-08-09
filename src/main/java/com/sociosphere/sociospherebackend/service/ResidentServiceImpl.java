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
}