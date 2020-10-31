package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DeliveryApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        String notification = shippingCenter.sendPackage("Warszawa", 12.5);
        System.out.println("Received: " + notification);
    }
}
