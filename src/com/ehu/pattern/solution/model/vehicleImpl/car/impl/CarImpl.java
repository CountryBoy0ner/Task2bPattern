package com.ehu.pattern.solution.model.vehicleImpl.car.impl;


import com.ehu.pattern.solution.model.Vehicle;
import com.ehu.pattern.solution.model.vehicleImpl.car.Car;

public class CarImpl extends Vehicle implements Car {
    private static CarType carType;
    private int maxSpeed;
    private TransmissionType transmissionType;


    public CarImpl() {}

    public CarType getType() {
        return carType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public  void setCarType(CarType carType) {
        CarImpl.carType = carType;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Car{id= "+getId()+", "+"name= "+getName()+", " + "maxSpeed= " + maxSpeed + ", transmissionType= " + transmissionType + '}';
    }

    @Override
    public void drive() {
        System.out.println("car" + this.getName() +"is moving "+ "\n");
    }
}
