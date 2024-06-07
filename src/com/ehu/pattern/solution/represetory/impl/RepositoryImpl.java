package com.ehu.pattern.solution.represetory.impl;

import com.ehu.pattern.solution.service.SortVehicleStrategy;
import com.ehu.pattern.solution.service.impl.SortVehicleStrategyById;
import com.ehu.pattern.solution.model.Vehicle;
import com.ehu.pattern.solution.represetory.Repository;

import java.util.ArrayList;

public class RepositoryImpl implements Repository {
    public SortVehicleStrategy strategy = new SortVehicleStrategyById();

    private final ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();



    public RepositoryImpl() {
    }



    @Override
    public void add(Vehicle vehicle) {
        vehicleArrayList.add(vehicle);

    }

    @Override
    public void remove(Vehicle vehicle) {
        vehicleArrayList.remove(vehicle);

    }

    @Override
    public void printAll() {
        System.out.println("---------------------------------");
        for (Vehicle vehicle : vehicleArrayList) {
            System.out.println(vehicle);

        }

    }


    @Override
    public void sort() {
        this.strategy.sortVehicle(vehicleArrayList);
    }

    @Override
    public void setStrategy(SortVehicleStrategy strategy) {
        this.strategy = strategy;
    }
}
