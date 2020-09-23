package com.kodilla.collections.interfaces;
import static java.lang.Math.PI;
import static java.lang.Math.round;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return round(PI * radius* radius) ;
    }

    public double getPerimeter() {
        return round(2 * PI * radius);
    }
}
