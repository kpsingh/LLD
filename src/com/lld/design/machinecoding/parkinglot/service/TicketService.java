package com.lld.design.machinecoding.parkinglot.service;

import com.lld.design.machinecoding.parkinglot.exceptions.InvalidGateFound;
import com.lld.design.machinecoding.parkinglot.exceptions.ParkingNotAvailanbleException;
import com.lld.design.machinecoding.parkinglot.models.*;
import com.lld.design.machinecoding.parkinglot.repository.IGateRepository;
import com.lld.design.machinecoding.parkinglot.repository.ParkingLotRepository;
import com.lld.design.machinecoding.parkinglot.repository.TicketRepository;
import com.lld.design.machinecoding.parkinglot.repository.VehicleRepository;
import com.lld.design.machinecoding.parkinglot.strategies.sportassignment.SpotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    TicketRepository ticketRepository;
    private IGateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;

    public TicketService(IGateRepository gateRepository, VehicleRepository vehicleRepository, SpotAssignmentStrategy spotAssignmentStrategy,
                         TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
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
        ParkingLot parkingLot = parkingLotRepository.findParkingLotByGate(gate);

        Optional<ParkingSpot> parkingSpotOptional = spotAssignmentStrategy.findSpot(vehicleType, parkingLot, gate);
        if(parkingSpotOptional.isEmpty()){
            throw new ParkingNotAvailanbleException("Parking for this vehicle type not available");
        }

        Operator operator = gate.getCurrentOperator();

        ticket.setGate(gate);
        ticket.setOperator(operator);
        ticket.setEntryTime(new Date());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(parkingSpotOptional.get());
        ticket = ticketRepository.save(ticket);

        return ticket;
    }
}
