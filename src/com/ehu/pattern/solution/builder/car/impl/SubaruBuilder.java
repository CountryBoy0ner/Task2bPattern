package com.ehu.pattern.solution.builder.car.impl;

import com.ehu.pattern.solution.builder.car.CarBuilder;

import static com.ehu.pattern.solution.model.vehicleImpl.car.impl.CarType.HATCHBACK;
import static com.ehu.pattern.solution.model.vehicleImpl.car.impl.TransmissionType.MANUAL;

public class SubaruBuilder extends CarBuilder {
    @Override
    public void buildCarType() {
        car.setCarType(HATCHBACK);
    }

    @Override
    public void buildCarMaxSpeed() {
        car.setMaxSpeed(210);
    }

    @Override
    public void buildCarTransmissionType() {
        car.setTransmissionType(MANUAL);
    }

    @Override
    public void buildCarName() {
        car.setName("Subaru");
    }
}
