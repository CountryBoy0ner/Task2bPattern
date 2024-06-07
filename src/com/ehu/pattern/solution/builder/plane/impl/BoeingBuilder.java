package com.ehu.pattern.solution.builder.plane.impl;

import com.ehu.pattern.solution.builder.plane.PlaneBuilder;

import static com.ehu.pattern.solution.model.vehicleImpl.plane.impl.PlaneType.AIRCRAFT;

public class BoeingBuilder extends PlaneBuilder {
    @Override
    public void buildPlaneType() {
        plane.setPlaneType(AIRCRAFT);
    }

    @Override
    public void buildPlaneMaxHigh() {
        plane.setMaxHigh(2000);
    }

    @Override
    public void buildPlaneName() {
        plane.setName(AIRCRAFT.name());
    }
}
