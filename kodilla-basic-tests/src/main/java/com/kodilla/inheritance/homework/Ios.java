package com.kodilla.inheritance.homework;

public class Ios extends OperatingSystem {
    public Ios(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Your version: Ios " + getYear());
    }

    @Override
    public void turnOff() {
        System.out.println("Ios system says goodbay!");
        super.turnOff();
    }
}
