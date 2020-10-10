package com.kodilla.exception.homework;

import java.time.LocalDate;

public class Order {
    private String number;
    private static int numberInThisYear = 1;
    private int year = 2020;

    public Order() {
        this.number = String.valueOf(numberInThisYear) + "/" + String.valueOf(year);
        numberInThisYear++;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", year=" + year +
                '}';
    }
}
