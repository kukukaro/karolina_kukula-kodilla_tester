package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jaguar jaguar = (Jaguar) o;
        return speed == jaguar.speed &&
                acceleration == jaguar.acceleration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, acceleration);
    }
}
