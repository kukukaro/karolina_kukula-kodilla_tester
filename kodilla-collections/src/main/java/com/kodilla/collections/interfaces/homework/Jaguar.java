package com.kodilla.collections.interfaces.homework;

public class Jaguar implements Car {
    int speed;
    int acceleration;

    public Jaguar(int speed, int acceleration) {
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public Jaguar(int acceleration){
        this.acceleration = acceleration;
        speed = 70;
    }

    @Override
    public int getAcceleration() {
        return acceleration;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += acceleration;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 15;
    }
}
