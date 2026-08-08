package com.sociosphere.sociospherebackend.repository;

import com.sociosphere.sociospherebackend.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident, Long> {

}