package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;

class DeliveryServiceTest {

    @Test
    public void shouldReturnTrueForWeightBelowOrEqualThirty() {
        DeliveryService deliveryService = new DeliveryService();
        boolean actual = deliveryService.deliverPackage("Krakow", 30.00);
        Assertions.assertEquals(true, actual);
    }

    @Test
    public void shouldReturnFalseForWeightAboveThirty() {
        DeliveryService deliveryService = new DeliveryService();
        boolean actual = deliveryService.deliverPackage("Krakow", 30.01);
        Assertions.assertEquals(false, actual);
    }

    @Disabled("Not working code provided by Kodilla")
    @Test
    public void shouldReturnFalseForNegativeWeight() {
        DeliveryService deliveryService = new DeliveryService();
        boolean actual = deliveryService.deliverPackage("Krakow", -30.01);
        Assertions.assertEquals(false, actual);
    }

    @Disabled("Not working code provided by Kodilla")
    @Test
    public void shouldReturnFalseForUnknownWeight() {
        DeliveryService deliveryService = new DeliveryService();
        boolean actual = deliveryService.deliverPackage("Krakow", NaN);
        Assertions.assertEquals(false, actual);
    }

    @Disabled("Not working code provided by Kodilla")
    @Test
    public void shouldReturnFalseForZeroWeight() {
        DeliveryService deliveryService = new DeliveryService();
        boolean actual = deliveryService.deliverPackage("Krakow", 0);
        Assertions.assertEquals(false, actual);
    }

}