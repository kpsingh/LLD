package com.lld.design.machinecoding.parkinglot.strategies.sportassignment;

import com.lld.design.machinecoding.parkinglot.models.*;

import java.util.Optional;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {
    @Override
    public Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate) {
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.getSpotStatus() == SpotStatus.AVAILABLE && parkingSpot.getSupportedVehicles().contains(vehicleType)) {
                    parkingSpot.setSpotStatus(SpotStatus.UNAVAILABLE);
                    return Optional.of(parkingSpot);
                }
            }
        }
        return Optional.empty();
    }
}