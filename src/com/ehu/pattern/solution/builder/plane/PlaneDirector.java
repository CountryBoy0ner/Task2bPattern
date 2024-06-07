package com.ehu.pattern.solution.builder.plane;

import com.ehu.pattern.solution.model.vehicleImpl.plane.Plane;

public class PlaneDirector {
    private PlaneBuilder builder;
    public void setBuilder(PlaneBuilder builder){
        this.builder = builder;
    }

    public Plane buildPlane(){
        builder.createPlane();
        builder.buildPlaneType();
        builder.buildPlaneMaxHigh();
        builder.buildPlaneName();
        return builder.getPlane();
    }
}
