package com.kodilla.abstracts.homework.shape;

import com.kodilla.abstracts.homework.shape.Shape;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double ha;

    public Triangle(double a, double b, double c, double ha){
        this.a = a;
        this.b = b;
        this.c = c;
        this.ha = ha;
    }

    @Override
    public double calculateArea() {
        return (a * ha / 2);
    }

    @Override
    public double calculateCircuit() {
        return (a + b + c);
    }


}
