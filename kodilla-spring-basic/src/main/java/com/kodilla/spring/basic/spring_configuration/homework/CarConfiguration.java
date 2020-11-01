package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {

    private String season = "Summer";
    private int hour = 8;

    private String[] seasons = new String[]{
            "Spring", "Summer", "Fall", "Winter"
    };

    @Bean
    public Car createCar() {
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
