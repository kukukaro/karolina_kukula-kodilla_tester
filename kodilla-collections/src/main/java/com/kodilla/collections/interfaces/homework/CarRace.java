package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car jaguar1 = new Jaguar(60);
        Car tesla1 = new Tesla(50);
        Car mustang1 = new Mustang(100);

        doRace(jaguar1);
        doRace(tesla1);
        doRace(mustang1);
    }

    private static void doRace(Car car) {
        String name = car.getClass().getSimpleName();
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Current speed of " + name + " is " + car.getSpeed() +"km/h.");
    }
}
