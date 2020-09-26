package com.kodilla.collections.interfaces;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
