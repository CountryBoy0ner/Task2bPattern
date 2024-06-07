package com.ehu.pattern.solution.service.impl;

import com.ehu.pattern.solution.model.Vehicle;
import com.ehu.pattern.solution.service.SortVehicleStrategy;
import java.util.ArrayList;
import java.util.Comparator;

public class SortVehicleStrategyById implements SortVehicleStrategy {
    @Override
    public ArrayList<Vehicle> sortVehicle(ArrayList<Vehicle> vehicleList) {

        vehicleList.sort(new Comparator<Vehicle>() {
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
              return o1.getId() - (o2.getId());
            }
        });

        return vehicleList;
    }
}
