package com.ehu.pattern.solution.builder.car;

import com.ehu.pattern.solution.model.vehicleImpl.car.Car;

public class CarDirector {
    private CarBuilder builder;
    public void setBuilder(CarBuilder builder){
        this.builder = builder;
    }

    public Car buildCar(){
        builder.createCar();
        builder.buildCarType();
        builder.buildCarMaxSpeed();
        builder.buildCarTransmissionType();
        builder.buildCarName();
        return builder.getCar();
    }

}
