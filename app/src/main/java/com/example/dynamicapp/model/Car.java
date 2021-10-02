package com.example.dynamicapp.model;

public class Car {
    private String Type;
    private String Make;
    private int model;

    public Car(String type, String make, int model) {
        Type = type;
        Make = make;
        this.model = model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
