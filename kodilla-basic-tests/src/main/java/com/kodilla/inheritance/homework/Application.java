package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem( 2016);
        Android android = new Android( 2018);
        Ios ios = new Ios(2020);

        System.out.println("Testing regular operating system");
        operatingSystem.turnOn();
        operatingSystem.turnOff();

        System.out.println("\nTesting android");
        android.turnOn();
        android.turnOff();

        System.out.println("\nTesting iOS");
        ios.turnOn();
        ios.turnOff();
    }


}
