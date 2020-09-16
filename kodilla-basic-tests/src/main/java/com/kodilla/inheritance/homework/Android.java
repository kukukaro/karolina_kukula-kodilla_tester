package com.kodilla.inheritance.homework;

public class Android extends OperatingSystem{

    public Android(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Your version: Android " + getYear());
    }

    @Override
    public void turnOff() {
        System.out.println("Android system says goodbay!");
        super.turnOff();
    }
}
