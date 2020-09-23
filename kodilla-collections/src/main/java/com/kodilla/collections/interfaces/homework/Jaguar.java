package com.kodilla.collections.interfaces.homework;

public class Jaguar implements Car {
    int speed;

    public Jaguar(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 20;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 15;
    }
}
