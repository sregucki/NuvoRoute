package com.nuvoroute.vehiclemanager.service;

import com.nuvoroute.vehiclemanager.model.Vehicle;
import com.nuvoroute.vehiclemanager.repository.VehicleRepository;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleService implements CrudInterface<Vehicle> {

    private final VehicleRepository vehicleRepository;

    @Override
    public boolean create(final Vehicle vehicle) {
        if (vehicleRepository.existsById(String.valueOf(vehicle.getId()))) {
            return false;
        }
        vehicleRepository.save(vehicle);
        return true;
    }

    @Override
    public Vehicle read(final UUID id) {
        return vehicleRepository.findById(String.valueOf(id)).orElse(null);
    }

    @Override
    public void update(final Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public boolean delete(final Vehicle vehicle) {
        if (!vehicleRepository.existsById(String.valueOf(vehicle.getId()))) {
            return false;
        }
        vehicleRepository.delete(vehicle);
        return true;
    }
}
