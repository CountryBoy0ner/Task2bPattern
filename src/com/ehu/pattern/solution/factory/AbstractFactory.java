package com.ehu.pattern.solution.factory;

import com.ehu.pattern.solution.builder.car.CarBuilder;
import com.ehu.pattern.solution.builder.plane.PlaneBuilder;
import com.ehu.pattern.solution.model.vehicleImpl.car.Car;
import com.ehu.pattern.solution.model.vehicleImpl.plane.Plane;

public interface AbstractFactory {
    public Car createCar(CarBuilder builder);
    public Plane createPlane(PlaneBuilder builder);
}
