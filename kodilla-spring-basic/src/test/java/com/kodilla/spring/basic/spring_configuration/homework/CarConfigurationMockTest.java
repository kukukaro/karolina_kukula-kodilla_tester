package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CarConfigurationMockTest {

    @MockBean
    SeasonService seasonService;

    @Autowired
    CarService carService;

    @Test
    public void shouldHasLightsTurnedOn() {
        Mockito.when(seasonService.hour()).thenReturn(6);
        Mockito.when(seasonService.season()).thenReturn("Winter");
        Car car = carService.createCar();
        boolean isTurnedOn = car.hasHeadLightsTurnedOn();
        Assertions.assertEquals(true, isTurnedOn);
    }

    @Configuration
    @Import(CarService.class)
    static class Config {

    }
}
