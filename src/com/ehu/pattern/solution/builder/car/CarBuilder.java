package com.ehu.pattern.solution.builder.car;

import com.ehu.pattern.solution.model.vehicleImpl.car.Car;
import com.ehu.pattern.solution.model.vehicleImpl.car.impl.CarImpl;

public abstract  class CarBuilder {
    public CarImpl car;
    public void  createCar(){
        car = new CarImpl();
    }
    public abstract void buildCarType();
    public abstract void buildCarMaxSpeed();
    public abstract void buildCarTransmissionType();
    public abstract void buildCarName();

    public Car getCar() {
        return car;
    }




}
