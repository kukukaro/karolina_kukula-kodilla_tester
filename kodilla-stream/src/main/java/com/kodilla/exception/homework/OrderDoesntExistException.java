package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception{

    private String missingNumber;

    public OrderDoesntExistException(String missingNumber) {
        super();
        this.missingNumber = missingNumber;
    }

    public String getMissingNumber() {
        return missingNumber;
    }
}
