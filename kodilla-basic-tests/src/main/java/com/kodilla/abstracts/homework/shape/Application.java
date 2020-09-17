package com.kodilla.abstracts.homework.shape;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(5.75);
        Rectangle rectangle = new Rectangle(10, 20.8);
        Triangle triangle = new Triangle(3, 4, 5, 3);

        System.out.println("Testing class Circle:");
        circle.printArea();
        circle.printCircuit();

        System.out.println("\nTesting class Rectangle:");
        rectangle.printArea();
        rectangle.printCircuit();

        System.out.println("\nTesting class Triangle:");
        triangle.printArea();
        triangle.printCircuit();
    }
}
