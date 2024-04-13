package com.lld.design.machinecoding.parkinglot.strategies.sportassignment;

import com.lld.design.machinecoding.parkinglot.models.Gate;
import com.lld.design.machinecoding.parkinglot.models.ParkingLot;
import com.lld.design.machinecoding.parkinglot.models.ParkingSpot;
import com.lld.design.machinecoding.parkinglot.models.VehicleType;

import java.util.Optional;

public interface SpotAssignmentStrategy {
   public Optional<ParkingSpot> findSpot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate);
}
