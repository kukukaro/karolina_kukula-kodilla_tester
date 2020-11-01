package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {
    private boolean lightsTurnedOn = false;
    @Override
    public boolean hasHeadLightsTurnedOn() {
       return lightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }

    public void setLightsTurnedOn(boolean lightsTurnedOn) {
        this.lightsTurnedOn = lightsTurnedOn;
    }
}
