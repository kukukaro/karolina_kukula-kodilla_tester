package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    private boolean lightsTurnedOn = false;

    public void setLightsTurnedOn(boolean lightsTurnedOn) {
        this.lightsTurnedOn = lightsTurnedOn;
    }

    @Override
    public boolean hasHeadLightsTurnedOn() {
        return lightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
