package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order());
        warehouse.addOrder(new Order());
        warehouse.addOrder(new Order());

        try {
            Order order = warehouse.getOrder();
            System.out.println("Found order: " + order);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order does not exist in warehouse. Didn't find " + e.getMissingNumber());
        } finally {
            System.out.println("Thank you.");
        }
    }
}
