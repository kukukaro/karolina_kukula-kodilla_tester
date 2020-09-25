package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Tesla;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(15) + 1;

        Car[] cars = new Car[arrayLength];

        for (int i = 0 ; i < cars.length ; i++) {
            cars[i] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int carType = random.nextInt(3);
        int acceleration = random.nextInt(30) + 5;

        switch (carType){
            case 0 : return new Jaguar(acceleration);
            case 1 : return new Tesla(acceleration);
            case 2 : return new Mustang(acceleration);
        }
        return null; //should never happens
    }
}
