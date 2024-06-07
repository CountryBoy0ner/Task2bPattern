package com.ehu.pattern.solution.main;
import com.ehu.pattern.solution.builder.car.impl.FolksWagenBuilder;
import com.ehu.pattern.solution.builder.car.impl.FordMondeoCarBuilder;
import com.ehu.pattern.solution.builder.car.impl.SubaruBuilder;
import com.ehu.pattern.solution.builder.car.CarDirector;
import com.ehu.pattern.solution.builder.plane.PlaneDirector;
import com.ehu.pattern.solution.builder.plane.impl.BoeingBuilder;
import com.ehu.pattern.solution.builder.plane.impl.HelicopterBuilder;
import com.ehu.pattern.solution.builder.plane.impl.RocketBuilder;
import com.ehu.pattern.solution.service.impl.SortVehicleStrategyById;
import com.ehu.pattern.solution.service.impl.SortVehicleStrategyByName;
import com.ehu.pattern.solution.factory.FactoryVehicleClient;
import com.ehu.pattern.solution.factory.impl.FactoryVehicleImpl;
import com.ehu.pattern.solution.represetory.Repository;
import com.ehu.pattern.solution.represetory.impl.RepositoryImpl;

public class Main {
    public static void main(String[] args) {
        FactoryVehicleImpl factory = new FactoryVehicleImpl(new CarDirector(), new PlaneDirector());
        FactoryVehicleClient client = new FactoryVehicleClient(factory, new SubaruBuilder(), new BoeingBuilder());
        FactoryVehicleClient secondClient = new FactoryVehicleClient(factory, new FordMondeoCarBuilder(), new RocketBuilder());
        FactoryVehicleClient thirdClient = new FactoryVehicleClient(factory, new FolksWagenBuilder(), new HelicopterBuilder());


        Repository repository = new RepositoryImpl();
        repository.add(client.plane());
        repository.add(client.car());
        repository.add(secondClient.plane());
        repository.add(secondClient.car());
        repository.add(thirdClient.plane());
        repository.add(thirdClient.car());
        repository.printAll();
        repository.setStrategy(new SortVehicleStrategyByName());
        repository.sort();
        repository.printAll();
        repository.setStrategy(new SortVehicleStrategyById());
        repository.sort();
        repository.printAll();



    }
}
