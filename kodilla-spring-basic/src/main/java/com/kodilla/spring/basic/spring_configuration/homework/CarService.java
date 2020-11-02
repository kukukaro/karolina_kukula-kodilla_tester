package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    SeasonService seasonService;

    public Car createCar() {
        String season = seasonService.season();
        Integer hour = seasonService.hour();

        Car car;
        if (season.equals("Fall") || season.equals("Spring")) {
            car = new Sedan();
        } else if (season.equals("Summer")) {
            car = new Cabrio();
        } else {
            car = new SUV();
        }

        car.setLightsTurnedOn(shouldTurnOnLights(hour));

        return car;
    }

    private boolean shouldTurnOnLights(int hour) {
        if (hour > 19 || hour < 7) {
            return true;
        }
        return false;
    }


}
