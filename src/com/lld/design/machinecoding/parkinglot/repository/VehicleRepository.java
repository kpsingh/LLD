package com.lld.design.machinecoding.parkinglot.repository;

import com.lld.design.machinecoding.parkinglot.models.Vehicle;

import java.util.Optional;

public class VehicleRepository {

    public Optional<Vehicle> findVehicleByVehicleNumber(String vehicleNumber) {

        return Optional.empty();
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        // save the vehicle
        return null;
    }
}
