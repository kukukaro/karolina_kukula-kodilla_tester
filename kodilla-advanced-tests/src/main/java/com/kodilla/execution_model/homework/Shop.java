package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> ordersFromDate(LocalDate dateFrom, LocalDate dateTo) {

        if (dateFrom.isBefore(dateTo) || dateFrom.isEqual(dateTo)) {
            return orders.stream()
                    .filter(u -> !u.getDate().isBefore(dateFrom))
                    .filter(u -> !u.getDate().isAfter(dateTo))
                    .collect(Collectors.toSet());
        }
        System.out.println("Please provide correct date. \"Date from\" should be before \"date to\".");
        return Collections.emptySet();

    }

    public Set<Order> ordersFromDate(LocalDate date) {

            return orders.stream()
                    .filter(u -> u.getDate().isEqual(date))
                    .collect(Collectors.toSet());

    }

    public Set<Order> orderFromValue(double lowLimit, double highLimit) {
        return orders.stream()
                .filter(u->u.getValue()>= lowLimit)
                .filter(u->u.getValue() <=highLimit)
                .collect(Collectors.toSet());
    }

    public Set<Order> orderFromValue(double value) {
        return orders.stream()
                .filter(u->u.getValue() == value)
                .collect(Collectors.toSet());
    }

    public int numberOfOrders() {
        return orders.size();
    }

    public double valueOfAllOrders() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }

}
