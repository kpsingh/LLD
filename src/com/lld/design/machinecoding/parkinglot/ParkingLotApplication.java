package com.lld.design.machinecoding.parkinglot;

import com.lld.design.machinecoding.parkinglot.controller.TicketController;
import com.lld.design.machinecoding.parkinglot.repository.GateRepository;
import com.lld.design.machinecoding.parkinglot.repository.ParkingLotRepository;
import com.lld.design.machinecoding.parkinglot.repository.TicketRepository;
import com.lld.design.machinecoding.parkinglot.repository.VehicleRepository;
import com.lld.design.machinecoding.parkinglot.service.TicketService;
import com.lld.design.machinecoding.parkinglot.strategies.sportassignment.RandomSpotAssignmentStrategy;
import com.lld.design.machinecoding.parkinglot.strategies.sportassignment.SpotAssignmentStrategy;

public class ParkingLotApplication {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        SpotAssignmentStrategy spotAssignmentStrategy = new RandomSpotAssignmentStrategy();

        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository,
                spotAssignmentStrategy,
                ticketRepository,
                parkingLotRepository);

        TicketController ticketController = new TicketController(ticketService);

        System.out.println("Application has started on part :8080");
    }
}
