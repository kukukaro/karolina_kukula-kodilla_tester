package calculator;

public class CalcApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(10);
        System.out.println("Area of the circle with radius 10 equals: " + area);

        double p = Calculator.PI;
        System.out.println("A value of the pi constant is equal to: " + p);

        Calculator calculator2 = new Calculator();
        System.out.println(Calculator.counter);
    }
}
