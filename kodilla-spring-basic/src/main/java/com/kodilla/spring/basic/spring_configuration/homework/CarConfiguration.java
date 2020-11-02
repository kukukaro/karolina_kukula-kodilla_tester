package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {

    @Bean
    public String season() {
        return "Summer";
    }

    @Bean
    public Integer hour() {
        return 8;
    }

    @Bean
    @Autowired
    public Car createCar(String season, Integer hour) {
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
        if (hour > 19 && hour < 7) {
            return true;
        }
        return false;
    }


}
