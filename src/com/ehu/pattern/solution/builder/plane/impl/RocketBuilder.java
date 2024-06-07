package com.ehu.pattern.solution.builder.plane.impl;

import com.ehu.pattern.solution.builder.plane.PlaneBuilder;

import static com.ehu.pattern.solution.model.vehicleImpl.plane.impl.PlaneType.ROCKET;

public class RocketBuilder extends PlaneBuilder {
    @Override
    public void buildPlaneType() {
        plane.setPlaneType(ROCKET);
    }

    @Override
    public void buildPlaneMaxHigh() {
        plane.setMaxHigh(300000);
    }

    @Override
    public void buildPlaneName() {
        plane.setName(ROCKET.name());
    }
}
