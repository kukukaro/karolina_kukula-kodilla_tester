package com.kodilla.abstracts.homework.shape;

public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculateCircuit();

    public void printArea(){
        System.out.println("Calculated area for " + this.getClass().getSimpleName() + " equals " + calculateArea());
    }
    public void printCircuit(){
        System.out.println("Calculated circuit for " + this.getClass().getSimpleName() + " equals " + calculateCircuit());
    }
}
