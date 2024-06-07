package com.ehu.pattern.solution.builder.plane.impl;

import com.ehu.pattern.solution.builder.plane.PlaneBuilder;

import static com.ehu.pattern.solution.model.vehicleImpl.plane.impl.PlaneType.HELICOPTER;

public class HelicopterBuilder extends PlaneBuilder {

    @Override
    public void buildPlaneType() {
        plane.setPlaneType(HELICOPTER);
    }

    @Override
    public void buildPlaneMaxHigh() {
        plane.setMaxHigh(1000);
    }

    @Override
    public void buildPlaneName() {
        plane.setName(HELICOPTER.name());
    }
}
