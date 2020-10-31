package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.*;

class DeliveryServiceTest {

    @Test
    public void shouldReturnTrueForWeightBelowOrEqualThirty() {
        DeliveryService deliveryService = new DeliveryService();
        boolean expected = deliveryService.deliverPackage("Krakow", 30.00);
        Assertions.assertEquals(true, expected);
    }

    @Test
    public void shouldReturnFalseForWeightAboveThirty() {
        DeliveryService deliveryService = new DeliveryService();
        boolean expected = deliveryService.deliverPackage("Krakow", 30.01);
        Assertions.assertEquals(false, expected);
    }

    @Test
    public void shouldReturnFalseForNegativeWeight() {
        DeliveryService deliveryService = new DeliveryService();
        boolean expected = deliveryService.deliverPackage("Krakow", -30.01);
        Assertions.assertEquals(false, expected);
    }

    @Test
    public void shouldReturnFalseForUnknownWeight() {
        DeliveryService deliveryService = new DeliveryService();
        boolean expected = deliveryService.deliverPackage("Krakow", NaN);
        Assertions.assertEquals(false, expected);
    }

    @Test
    public void shouldReturnFalseForZeroWeight() {
        DeliveryService deliveryService = new DeliveryService();
        boolean expected = deliveryService.deliverPackage("Krakow", 0);
        Assertions.assertEquals(false, expected);
    }

}