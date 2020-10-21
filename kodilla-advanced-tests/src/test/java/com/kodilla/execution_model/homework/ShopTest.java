package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTest {

    private Shop shop = new Shop();

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(new Order(15.00, LocalDate.of(2020, 10, 9), "OO7Karo"));
        shop.addOrder(new Order(35.00, LocalDate.of(2020, 10, 8), "JanekK"));
        shop.addOrder(new Order(25.00, LocalDate.of(2020, 10, 8), "JK"));
        shop.addOrder(new Order(10.00, LocalDate.of(2020, 10, 7), "Jan"));
        shop.addOrder(new Order(5.00, LocalDate.of(2020, 10, 6), "Janek"));
        shop.addOrder(new Order(0.99, LocalDate.of(2020, 10, 5), "JkkK"));
    }


    @Test
    public void shouldReturnNumberOfAllOrders() {
        assertEquals(6, shop.numberOfOrders());
    }


    @Test
    public void shouldReturnValueOfAllOrders() {
        assertEquals((double) 90.99, shop.valueOfAllOrders(), (double) 00.01);
    }

    @Test
    public void shouldReturnSetOfOrdersBetweenDates() {
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(10.00, LocalDate.of(2020, 10, 7), "Jan"));
        expected.add(new Order(5.00, LocalDate.of(2020, 10, 6), "Janek"));
        expected.add(new Order(0.99, LocalDate.of(2020, 10, 5), "JkkK"));
        LocalDate dateFrom = LocalDate.of(2020, 10, 5);
        LocalDate dateTo = LocalDate.of(2020, 10, 7);
        Set<Order> result = shop.ordersFromDate(dateFrom, dateTo);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnSetOfOrdersFromOneDay() {
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(35.00, LocalDate.of(2020, 10, 8), "JanekK"));
        expected.add(new Order(25.00, LocalDate.of(2020, 10, 8), "JK"));
        LocalDate date = LocalDate.of(2020, 10, 8);
        Set<Order> result = shop.ordersFromDate(date);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptySetOfOrdersBetweenDateIfThereIsNoOrders() {
        Set<Order> expected = Collections.emptySet();
        LocalDate dateFrom = LocalDate.of(2020, 10, 13);
        LocalDate dateTo = LocalDate.of(2020, 10, 10);
        Set<Order> result = shop.ordersFromDate(dateFrom, dateTo);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptySetOfOrdersBetweenWrongDateProvided() {
        Set<Order> expected = Collections.emptySet();
        LocalDate dateFrom = LocalDate.of(2020, 10, 7);
        LocalDate dateTo = LocalDate.of(2020, 10, 6);
        Set<Order> result = shop.ordersFromDate(dateFrom, dateTo);

        assertEquals(expected, result);
    }


    @Test
    public void shouldReturnSetOfOrdersBetweenValues() {
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(10.00, LocalDate.of(2020, 10, 7), "Jan"));
        expected.add(new Order(5.00, LocalDate.of(2020, 10, 6), "Janek"));
        expected.add(new Order(0.99, LocalDate.of(2020, 10, 5), "JkkK"));
        Set<Order> result = shop.orderFromValue(0.00, 10.00);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptySetOfOrdersBetweenNotExistingValues() {
        Set<Order> expected = Collections.emptySet();
        Set<Order> result = shop.orderFromValue(100.00, 200.00);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnSetOfOrdersForTheSameValue() {
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(0.99, LocalDate.of(2020, 10, 5), "JkkK"));
        Set<Order> result = shop.orderFromValue(0.99);

        assertEquals(expected, result);
    }

}