package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class NotificationServiceTest {

    @Test
    public void shouldReturnCorrectMessageForSuccess() {
        NotificationService notificationService = new NotificationService();
        String message = notificationService.success("Kraków");
        Assertions.assertEquals("Package delivered to: Kraków", message);
    }

    @Test
    public void shouldReturnCorrectMessageForFailed() {
        NotificationService notificationService = new NotificationService();
        String message = notificationService.fail("Kraków");
        Assertions.assertEquals("Package not delivered to: Kraków", message);
    }


}