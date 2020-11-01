package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

@SpringBootTest
class ClockTest {

    @Test
    public void shouldCreateDifferentClocks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = (Clock) context.getBean("clock", LocalDateTime.of(2020, 11, 1, 21, 32, 33));
        Clock secondBean = (Clock) context.getBean("clock", LocalDateTime.of(2020, 11, 1, 21, 33, 33));
        Clock thirdBean = (Clock) context.getBean("clock", LocalDateTime.of(2020, 11, 1, 21, 34, 33));
        Assertions.assertNotEquals(firstBean, secondBean);
        Assertions.assertNotEquals(secondBean, thirdBean);
        Assertions.assertNotEquals(firstBean, thirdBean);
    }
}