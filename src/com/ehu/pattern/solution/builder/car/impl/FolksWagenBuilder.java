package com.ehu.pattern.solution.builder.car.impl;

import com.ehu.pattern.solution.builder.car.CarBuilder;

import static com.ehu.pattern.solution.model.vehicleImpl.car.impl.CarType.VAN;
import static com.ehu.pattern.solution.model.vehicleImpl.car.impl.TransmissionType.MANUAL;

public class FolksWagenBuilder extends CarBuilder {
    @Override
    public void buildCarType() {
        car.setCarType(VAN);
    }

    @Override
    public void buildCarMaxSpeed() {
        car.setMaxSpeed(140);
    }

    @Override
    public void buildCarTransmissionType() {
        car.setTransmissionType(MANUAL);
    }

    @Override
    public void buildCarName() {
        car.setName("FolksWagen");
    }
}
