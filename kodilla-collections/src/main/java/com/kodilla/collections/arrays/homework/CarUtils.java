package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Tesla;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("-------------------");
        System.out.println("Car name: " + getCarInfo(car));
        System.out.println("Car acceleration: " + car.getAcceleration());
    }

    private static String getCarInfo(Car car) {
        if (car instanceof Jaguar) {
            return "Jaguar";
        }
        else if (car instanceof Tesla) {
            return "Tesla";
        }
        else if (car instanceof Mustang) {
            return "Mustang";
        }
        else return "Unknown car.";
    }
}
