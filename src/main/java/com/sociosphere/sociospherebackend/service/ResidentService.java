package com.sociosphere.sociospherebackend.service;

import com.sociosphere.sociospherebackend.entity.Resident;
import java.util.List;

public interface ResidentService {

    void saveResident(Resident resident);
    List<Resident> getAllResidents();
    void deleteResident(Long residentId);
    void updateResident(Long residentId, Resident resident);

}