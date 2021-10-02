package com.example.dynamicapp.model;

import java.util.ArrayList;

public class CarModel {
    private ArrayList<Car> carTypes = new ArrayList<Car>();

    public CarModel (){
        carTypes.add(new Car("SUV","santafey",2001));
        carTypes.add(new Car("Sedan","BMW",2020));
        carTypes.add(new Car("Hatchpack","Skoda",2020));
    }

    public Car getCarByType(String type){
        Car car = null;
        for (Car c : carTypes){
            if (c.getType().equals(type))
                return c;
        }
        return car;
    }
}
