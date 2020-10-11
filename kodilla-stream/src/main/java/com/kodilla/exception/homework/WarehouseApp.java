package com.kodilla.exception.homework;

import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order(warehouse.getNextNumberInThisYear(), warehouse.getYear()));
        warehouse.addOrder(new Order(warehouse.getNextNumberInThisYear(), warehouse.getYear()));
        warehouse.addOrder(new Order(warehouse.getNextNumberInThisYear(), warehouse.getYear()));

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type number of searching order: ");
            String orderNumber = scanner.nextLine();
            Order order = warehouse.getOrder(orderNumber);
            System.out.println("Found order: " + order);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order does not exist in warehouse. Didn't find " + e.getMissingNumber());
        } finally {
            System.out.println("Thank you.");
        }
    }
}
