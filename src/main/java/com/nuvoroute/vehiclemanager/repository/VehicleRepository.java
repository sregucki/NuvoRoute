package com.nuvoroute.vehiclemanager.repository;

import com.nuvoroute.vehiclemanager.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String> {}
