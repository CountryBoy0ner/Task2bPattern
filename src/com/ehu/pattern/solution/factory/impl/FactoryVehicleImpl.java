package com.ehu.pattern.solution.factory.impl;

import com.ehu.pattern.solution.builder.car.CarBuilder;
import com.ehu.pattern.solution.builder.car.CarDirector;
import com.ehu.pattern.solution.builder.plane.PlaneBuilder;
import com.ehu.pattern.solution.builder.plane.PlaneDirector;
import com.ehu.pattern.solution.factory.AbstractFactory;
import com.ehu.pattern.solution.model.vehicleImpl.car.Car;
import com.ehu.pattern.solution.model.vehicleImpl.plane.Plane;

public class FactoryVehicleImpl implements AbstractFactory {
    CarDirector carDirector = new CarDirector();
    PlaneDirector planeDirector = new PlaneDirector();

    public FactoryVehicleImpl(CarDirector directory, PlaneDirector planeDirector) {
        this.carDirector = directory;
        this.planeDirector = planeDirector;
    }

    @Override
    public Car createCar(CarBuilder builder) {
        carDirector.setBuilder(builder);
        return carDirector.buildCar();

    }

    @Override
    public Plane createPlane(PlaneBuilder builder) {
        planeDirector.setBuilder(builder);
        return (Plane) planeDirector.buildPlane();
    }
}
