package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class CarConfigurationMockTest {

    @Bean
    String season = "Winter";

    @Bean
    Integer hour = 23;

    @Autowired
    Car createCar;

    @Test
    public void shouldHasLightsTurnedOn() {
        boolean isTurnedOn = createCar.hasHeadLightsTurnedOn();
        Assertions.assertEquals(true, isTurnedOn);
    }

}
