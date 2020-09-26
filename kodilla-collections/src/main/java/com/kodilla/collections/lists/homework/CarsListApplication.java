package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Jaguar;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Tesla;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Tesla(9));
        cars.add(new Tesla(12));
        cars.add(new Tesla(16));
        Car tesla = new Tesla(12);
        Jaguar jaguar = new Jaguar(25);
        cars.add(jaguar);
        cars.add(new Jaguar(25));
        cars.add(new Jaguar(30));
        cars.add(new Mustang(22));

        for (Car car : cars)
            CarUtils.describeCar(car);
        System.out.println(cars.size());

        cars.remove(0);
        cars.remove(tesla);
        cars.remove(jaguar);

        for (Car car : cars)
            CarUtils.describeCar(car);
        System.out.println("List size: " + cars.size());
    }

}
