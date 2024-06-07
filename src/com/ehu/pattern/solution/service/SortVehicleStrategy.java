package com.ehu.pattern.solution.service;

import com.ehu.pattern.solution.model.Vehicle;

import java.util.ArrayList;

public interface SortVehicleStrategy {
    public ArrayList<Vehicle> sortVehicle(ArrayList<Vehicle> vehicleList);
}
