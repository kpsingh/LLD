package com.lld.design.machinecoding.parkinglot.repository;

import com.lld.design.machinecoding.parkinglot.models.Gate;

import java.util.Optional;

public class GateRepository implements  IGateRepository{

    @Override
    public Optional<Gate> findGateById(Long gateId) {
        return Optional.empty();
    }
}
