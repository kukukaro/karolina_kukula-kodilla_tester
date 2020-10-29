package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

    @Test
    public void shouldAdd () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(7.8,  calculator.add(4.5, 3.3 ));
    }

    @Test
    public void shouldDisplayAdding() {
    }

    @Test
    public void shouldSubtract () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(2.2,  calculator.subtract(5.5, 3.3));
    }

    @Test
    public void shouldMultiply () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(5.0,  calculator.multiply(2.5, 2.0));
    }

    @Test
    public void shouldDivide () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(4.0,  calculator.divide(10.0, 2.5));
    }

    @Test
    public void shouldNotDivideByZero () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(Double.NaN,  calculator.divide(10.0, 0.00));
    }

}