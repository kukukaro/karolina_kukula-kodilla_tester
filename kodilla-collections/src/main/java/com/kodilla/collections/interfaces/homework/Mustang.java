package com.kodilla.collections.interfaces.homework;

public class Mustang implements Car {
    int speed;

    public Mustang(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 30;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 25;
    }
}
