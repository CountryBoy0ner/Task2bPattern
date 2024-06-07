package com.ehu.pattern.solution.builder.plane;

import com.ehu.pattern.solution.model.vehicleImpl.plane.Plane;
import com.ehu.pattern.solution.model.vehicleImpl.plane.impl.PlaneImpl;

public abstract  class PlaneBuilder {
    public PlaneImpl plane;
    public void createPlane() {
        plane = new PlaneImpl();
    }
    public abstract void buildPlaneType();
    public abstract void buildPlaneMaxHigh();
    public abstract void buildPlaneName();


    public Plane getPlane() {
        return plane;
    }
}
