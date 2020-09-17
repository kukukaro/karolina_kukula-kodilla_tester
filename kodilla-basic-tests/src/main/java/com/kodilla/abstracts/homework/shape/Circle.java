package com.kodilla.abstracts.homework.shape;

import static java.lang.Math.PI;
import static java.lang.Math.round;

public class Circle extends Shape {
    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return round(PI * r * r);
    }

    @Override
    public double calculateCircuit() {
        return round(2 * PI * r);
    }


}
