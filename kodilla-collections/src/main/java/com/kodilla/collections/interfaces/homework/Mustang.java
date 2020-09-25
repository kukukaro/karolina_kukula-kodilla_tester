package com.kodilla.collections.interfaces.homework;

public class Mustang implements Car {
    int speed;
    int acceleration;

    public Mustang(int speed, int acceleration) {
        this.speed = speed;
        this.acceleration = acceleration;
    }

    @Override
    public int getAcceleration() {
        return acceleration;
    }

    public Mustang(int acceleration) {
        this.acceleration = acceleration;
        speed = 80;
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
        speed -= 25;
    }
}
