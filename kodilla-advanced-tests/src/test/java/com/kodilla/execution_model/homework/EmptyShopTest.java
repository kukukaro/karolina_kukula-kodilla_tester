package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmptyShopTest {

    Shop shop = new Shop();

    @Test
    public void shouldReturnZeroForNoneOrders() {
        assertEquals(0, shop.numberOfOrders());
    }
    @Test
    public void shouldAddOrder() {
        shop.addOrder(new Order(9.00, LocalDate.of(2020, 10, 10), "Kpp"));
        assertEquals(1, shop.numberOfOrders());
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
        assertEquals(expected, shop.ordersFromDate(dateFrom, dateTo));
    }





}
