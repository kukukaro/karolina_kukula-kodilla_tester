package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tesla tesla = (Tesla) o;
        return speed == tesla.speed &&
                acceleration == tesla.acceleration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, acceleration);
    }
}
