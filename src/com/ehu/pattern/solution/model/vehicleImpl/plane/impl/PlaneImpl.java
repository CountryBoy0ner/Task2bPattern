package com.ehu.pattern.solution.model.vehicleImpl.plane.impl;

import com.ehu.pattern.solution.model.Vehicle;
import com.ehu.pattern.solution.model.vehicleImpl.plane.Plane;

public class PlaneImpl extends Vehicle implements Plane {
    private  PlaneType planeType;
    private int maxHigh;

    public PlaneImpl() {
    }
    public PlaneType getPlaneType() {
        return this.planeType;
    }
    public int getMaxHigh() {
        return maxHigh;
    }
    public  void setPlaneType(PlaneType planeType) {
       this.planeType = planeType;
    }
    public void setMaxHigh(int maxHigh) {
        this.maxHigh = maxHigh;
    }

    @Override
    public String toString() {
        return "PlaneImpl{id= "+this.getId()+ ", name= "+this.getName() + ", planeType= " + planeType + ", maxHigh=" + maxHigh + '}';
    }

    @Override
    public void fly() {
        System.out.println("\n"+"plane" + this.getName() +"is flying");
    }
}
