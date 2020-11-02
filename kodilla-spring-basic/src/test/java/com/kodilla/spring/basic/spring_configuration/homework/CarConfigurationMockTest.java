package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CarConfigurationMockTest {

    @Mock
    SeasonService seasonService;

    @InjectMocks
    CarService carService;

    @Test
    public void shouldHasLightsTurnedOn() {
        Mockito.when(seasonService.hour()).thenReturn(6);
        Mockito.when(seasonService.season()).thenReturn("Winter");

        Car car = carService.createCar();
        boolean isTurnedOn = car.hasHeadLightsTurnedOn();
        Assertions.assertEquals(true, isTurnedOn);
        Assertions.assertEquals(SUV.class, car.getClass());
    }
}
