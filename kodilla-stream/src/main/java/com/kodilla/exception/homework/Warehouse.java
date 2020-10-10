package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder() throws OrderDoesntExistException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type number of searching order: ");
        String number = scanner.nextLine();

        Order result = orders
                .stream()
                .filter(u->u.getNumber().equals(number))
                .findFirst().orElseThrow(()->new OrderDoesntExistException(number));

        return result;
    }
}
