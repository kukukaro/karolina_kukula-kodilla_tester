package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTest {

    Shop shop = new Shop();

    public void initializeShop() {
        shop.addOrder(new Order(15.00, LocalDate.of(2020, 10, 9), "OO7Karo"));
        shop.addOrder(new Order(35.00, LocalDate.of(2020, 10, 8), "JanekK"));
        shop.addOrder(new Order(25.00, LocalDate.of(2020, 10, 8), "JK"));
        shop.addOrder(new Order(10.00, LocalDate.of(2020, 10, 7), "Jan"));
        shop.addOrder(new Order(5.00, LocalDate.of(2020, 10, 6), "Janek"));
        shop.addOrder(new Order(0.99, LocalDate.of(2020, 10, 5), "JkkK"));
    }

    @AfterEach
    public void deleteAllOrders() {
        shop.deleteAllOrders();
    }

    @Test
    public void shouldReturnZeroOrdersForNewShop() {
        assertEquals(0, shop.numberOfOrders());
    }

    @Test
    public void shouldAddOrder() {
        shop.addOrder(new Order(9.99, LocalDate.of(2020, 10, 10), "Kpp"));
        assertEquals(1, shop.numberOfOrders());
    }

    @Test
    public void shouldReturnNumberOfAllOrders() {
        initializeShop();
        assertEquals(6, shop.numberOfOrders());
    }

    @Test
    public void shouldReturnZeroForNoneOrders() {
        assertEquals(0, shop.numberOfOrders());
    }

    @Test
    public void shouldReturnValueOfAllOrders() {
        initializeShop();

        assertEquals((double) 90.99, shop.valueOfAllOrders(), (double) 00.01 );
    }

    @Test
    public void shouldReturnZeroValueForNoneOrders() {
        assertEquals(0, shop.valueOfAllOrders());
    }

    @Test
    public void shouldReturnEmptySetFromOrdersBetweenDatesForNoneOrders() {
        Set<Order> expected = Collections.emptySet();
        LocalDate dateFrom = LocalDate.of(2020, 10, 10);
        LocalDate dateTo = LocalDate.of(2020, 10, 19);
        assertEquals(expected, shop.ordersBetweenDates(dateFrom, dateTo));
    }

    @Test
    public void shouldReturnSetOfOrdersBetweenDates() {
        initializeShop();
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(10.00, LocalDate.of(2020, 10, 7), "Jan"));
        expected.add(new Order(5.00, LocalDate.of(2020, 10, 6), "Janek"));
        LocalDate dateFrom = LocalDate.of(2020, 10, 6);
        LocalDate dateTo = LocalDate.of(2020, 10, 7);
        Set<Order> result = shop.ordersBetweenDates(dateFrom, dateTo);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptySetOfOrdersBetweenWrongDateProvided(){
        initializeShop();
        Set<Order> expected = Collections.emptySet();
        LocalDate dateFrom = LocalDate.of(2020, 10, 7);
        LocalDate dateTo = LocalDate.of(2020, 10, 6);
        Set<Order> result = shop.ordersBetweenDates(dateFrom, dateTo);

        assertEquals(expected, result);
    }

    @Test
    public void shouldReturnEmptySetFromOrdersBetweenValuesForNoneOrders() {
        Set<Order> expected = Collections.emptySet();
        assertEquals(expected, shop.orderBetweenValues(5.00, 10.00));
    }

    @Test
    public void shouldReturnSetOfOrdersBetweenValues() {
        initializeShop();
        Set<Order> expected = new HashSet<>();
        expected.add(new Order(10.00, LocalDate.of(2020, 10, 7), "Jan"));
        expected.add(new Order(5.00, LocalDate.of(2020, 10, 6), "Janek"));
        Set<Order> result = shop.orderBetweenValues(5.00, 10.00);

        assertEquals(expected, result);
    }


}