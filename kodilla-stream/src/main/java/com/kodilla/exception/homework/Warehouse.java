package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private int numberInThisYear = 1;
    private int year = 2020;
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {

        Order result = orders
                .stream()
                .filter(u->u.getNumber().equals(number))
                .findFirst().orElseThrow(()->new OrderDoesntExistException(number));

        return result;
    }

    public int getNextNumberInThisYear() {
        return numberInThisYear++;
    }

    public int getYear() {
        return year;
    }
}

