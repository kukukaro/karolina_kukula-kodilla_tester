package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTest {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    public void shouldGetSuccessMessageForWeightLimit() {
        String message = shippingCenter.sendPackage("Kraków", 30.00);
        Assertions.assertEquals("Package delivered to: Kraków", message);
    }

    @Test
    public void shouldGetFailedMessageForWeightLimit() {
        String message = shippingCenter.sendPackage("Kraków", 30.01);
        Assertions.assertEquals("Package not delivered to: Kraków", message);
    }
}