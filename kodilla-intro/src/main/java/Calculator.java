public class Calculator {
    static final double PI = Math.PI;
    static int counter = 0;

    public Calculator() {
        counter++;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea( double r) {
        String name = UserDialogs.getUserName();
        System.out.println("Hi, " + name + ".Thank you for using our software.");
        return PI * r * r;
    }

    public double circlePerimeter(double r) {
        return 2 * PI * r;
    }

}
