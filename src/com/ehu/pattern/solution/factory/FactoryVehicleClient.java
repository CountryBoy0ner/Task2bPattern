package com.ehu.pattern.solution.factory;

import com.ehu.pattern.solution.builder.car.CarBuilder;
import com.ehu.pattern.solution.builder.plane.PlaneBuilder;
import com.ehu.pattern.solution.factory.impl.FactoryVehicleImpl;
import com.ehu.pattern.solution.model.vehicleImpl.car.Car;
import com.ehu.pattern.solution.model.vehicleImpl.car.impl.CarImpl;
import com.ehu.pattern.solution.model.vehicleImpl.plane.Plane;
import com.ehu.pattern.solution.model.vehicleImpl.plane.impl.PlaneImpl;

public class FactoryVehicleClient {
    private final Plane plane;
    private final Car car;

    public FactoryVehicleClient(FactoryVehicleImpl factory, CarBuilder carBuilder, PlaneBuilder planeBuilder) {
       this.car = factory.createCar(carBuilder);
       this.plane =factory.createPlane(planeBuilder);
    }
    public PlaneImpl plane() {

        return (PlaneImpl) this.plane;

    }
    public CarImpl car() {

        return (CarImpl) this.car;
    }

}
