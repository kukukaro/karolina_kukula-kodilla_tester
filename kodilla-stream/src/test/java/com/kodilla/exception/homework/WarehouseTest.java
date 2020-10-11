package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTest {

    @Test
    public void isGetOrderReturnCorrectValue() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();

        Order order1 = new Order(warehouse.getNextNumberInThisYear(), warehouse.getYear());
        Order order2 = new Order(warehouse.getNextNumberInThisYear(), warehouse.getYear());

        warehouse.addOrder(order1);
        warehouse.addOrder(order2);

        //when
        Order order = warehouse.getOrder("2/2020");

        //then
        assertEquals("2/2020", order.getNumber());

    }

    @Test(expected = OrderDoesntExistException.class)
    public void isGetOrderReturnException() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order(warehouse.getNextNumberInThisYear(), warehouse.getYear()));
        //when
        Order order = warehouse.getOrder("3/2020");

    }
}