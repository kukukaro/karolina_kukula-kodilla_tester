package com.kodilla.exception.homework;

import java.time.LocalDate;

public class Order {
    private String number;


    public Order(int numberInThisYear, int year) {
        this.number = String.valueOf(numberInThisYear) + "/" + String.valueOf(year);
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                '}';
    }
}
