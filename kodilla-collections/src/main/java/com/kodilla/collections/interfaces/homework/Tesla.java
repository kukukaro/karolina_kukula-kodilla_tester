package com.kodilla.collections.interfaces.homework;

public class Tesla implements Car {
    int speed;
    int acceleration;

    public Tesla(int speed, int acceleration) {
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public Tesla(int acceleration) {
        this.acceleration = acceleration;
        speed = 50;
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
        speed -= 10;
    }

    @Override
    public int getAcceleration() {
        return acceleration;
    }
}
