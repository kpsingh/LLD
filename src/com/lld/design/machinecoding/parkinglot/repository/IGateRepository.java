package com.lld.design.machinecoding.parkinglot.repository;

import com.lld.design.machinecoding.parkinglot.models.Gate;

import java.util.Optional;

public interface IGateRepository {
    public Optional<Gate> findGateById(Long gateId);
}
