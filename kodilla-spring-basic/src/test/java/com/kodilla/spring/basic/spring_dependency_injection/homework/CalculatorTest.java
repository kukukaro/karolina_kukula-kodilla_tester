package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CalculatorTest {

    private ApplicationContext prepareApplicationContext() {
        return new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    }

    @Test
    public void shouldAdd() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(7.8, calculator.add(4.5, 3.3));
    }

    @Test
    public void shouldAddNegativeValues() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(-7.8, calculator.add(-4.5, -3.3));
    }

    @Test
    public void shouldAddBigNumbers() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(1999999999999999.98, calculator.add(999999999999999.99, 999999999999999.99));
    }


    @Test
    public void shouldDisplayAdding() {
    }

    @Test
    public void shouldSubtract() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(2.2, calculator.subtract(5.5, 3.3));
    }

    @Test
    public void shouldSubtractNegativeValue() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(8.8, calculator.subtract(5.5, -3.3));
    }

    @Test
    public void shouldMultiply() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(5.0, calculator.multiply(2.5, 2.0));
    }

    @Test
    public void shouldMultiplyByZero() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(0.0, calculator.multiply(2.5, 0.0));
    }

    @Test
    public void shouldMultiplyByNegativeValue() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(-50.0, calculator.multiply(2.5, -20.0));
    }

    @Test
    public void shouldMultiplyNegativesValues() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(50.0, calculator.multiply(-2.5, -20.0));
    }


    @Test
    public void shouldDivide() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(4.0, calculator.divide(10.0, 2.5));
    }

    @Test
    public void shouldDivideByNegativeValue() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(-4.0, calculator.divide(10.0, -2.5));
    }

    @Test
    public void shouldNotDivideByZero() {
        ApplicationContext context = prepareApplicationContext();
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        Assertions.assertEquals(Double.NaN, calculator.divide(10.0, 0.00));
    }

}