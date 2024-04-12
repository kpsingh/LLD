package com.lld.design.machinecoding.parkinglot.controller;

import com.lld.design.machinecoding.parkinglot.dtos.GenerateTicketRequestDto;
import com.lld.design.machinecoding.parkinglot.dtos.GenerateTicketResponseDto;
import com.lld.design.machinecoding.parkinglot.dtos.ResponseStatus;
import com.lld.design.machinecoding.parkinglot.models.Ticket;
import com.lld.design.machinecoding.parkinglot.models.VehicleType;
import com.lld.design.machinecoding.parkinglot.service.TicketService;

public class TicketController {

    TicketService ticketService;

    TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }


    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto request) throws Exception {
        VehicleType vehicleType = request.getVehicleType();
        String vehicleNumber = request.getVehicleNumber();
        Long gateID = request.getGateId();

        Ticket ticket = ticketService.generateTicket(vehicleType, vehicleNumber, gateID);

        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setSpotNumber(ticket.getParkingSpot().getNumber());
        responseDto.setTicketId(ticket.getId());
        responseDto.setOperatorName(ticket.getOperator().getName());
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        return responseDto;

    }
}
