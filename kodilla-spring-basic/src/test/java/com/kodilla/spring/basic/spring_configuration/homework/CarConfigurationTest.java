package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CarConfigurationTest {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");

    @Test
    public void shouldCreateCabrio() {
        Cabrio cabrio = context.getBean(Cabrio.class);
        String carType = cabrio.getCarType();
        Assertions.assertEquals("Cabrio", carType);
    }

    @Test
    public void shouldHasLightsTurnedOff() {
        Cabrio cabrio = (Cabrio) context.getBean("createCar");
        boolean isTurnedOn = cabrio.hasHeadLightsTurnedOn();
        Assertions.assertEquals(false, isTurnedOn);
    }



}