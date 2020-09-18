package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = -3;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        int subResult = calculator.subtract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, subResult);
        int squareResult = calculator.square(a);
        boolean correct3 = ResultChecker.assertEquals(25, squareResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correct2) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correct3) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a);
        }

    }
}
