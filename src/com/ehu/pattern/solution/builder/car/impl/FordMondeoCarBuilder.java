package com.ehu.pattern.solution.builder.car.impl;

import com.ehu.pattern.solution.builder.car.CarBuilder;

import static com.ehu.pattern.solution.model.vehicleImpl.car.impl.CarType.SEDAN;
import static com.ehu.pattern.solution.model.vehicleImpl.car.impl.TransmissionType.AUTOMATIC;

public class FordMondeoCarBuilder extends CarBuilder {


    @Override
    public void buildCarType() {
        car.setCarType(SEDAN);
    }
    @Override
    public void buildCarMaxSpeed() {
        car.setMaxSpeed(200);
    }
    @Override
    public void buildCarTransmissionType() {
        car.setTransmissionType(AUTOMATIC);
    }

    @Override
    public void buildCarName() {
        car.setName("FordMondeo");
    }

}
