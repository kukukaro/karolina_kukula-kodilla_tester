package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    private boolean lightsTurnedOn = false;
    @Override
    public boolean hasHeadLightsTurnedOn() {
        return  lightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }

    public void setLightsTurnedOn(boolean lightsTurnedOn) {
        this.lightsTurnedOn = lightsTurnedOn;
    }
}
