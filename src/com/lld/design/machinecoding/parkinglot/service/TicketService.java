package com.lld.design.machinecoding.parkinglot.service;

import com.lld.design.machinecoding.parkinglot.exceptions.InvalidGateFound;
import com.lld.design.machinecoding.parkinglot.models.*;
import com.lld.design.machinecoding.parkinglot.repository.GateRepository;
import com.lld.design.machinecoding.parkinglot.repository.VehicleRepository;
import com.lld.design.machinecoding.parkinglot.strategies.sportassignment.SpotAssignmentStrategy;

import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;

    TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, SpotAssignmentStrategy spotAssignmentStrategy) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }


    public Ticket generateTicket(VehicleType vehicleType, String vehicleNumber, Long gateID) throws Exception {
        Ticket ticket = new Ticket();

        Gate gate = gateRepository.findGateById(gateID).orElseThrow(() -> new InvalidGateFound("This is not a valid gate"));
        Vehicle vehicle;
        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        if (vehicleOptional.isEmpty()) {
            vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle = vehicleRepository.saveVehicle(vehicle);

        } else {
            vehicle = vehicleOptional.get();
        }


        return ticket;
    }
}
