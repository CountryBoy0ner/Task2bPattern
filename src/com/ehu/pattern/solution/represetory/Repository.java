package com.ehu.pattern.solution.represetory;

import com.ehu.pattern.solution.service.SortVehicleStrategy;
import com.ehu.pattern.solution.model.Vehicle;

public interface Repository  {
    void add(Vehicle vehicle);
    void remove(Vehicle vehicle);
    void printAll();
    void sort();
    void setStrategy(SortVehicleStrategy strategy);

}
