package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope("prototype")
public class Clock {
    LocalDateTime time = LocalDateTime.now();

    public Clock(LocalDateTime time) {
        System.out.println("Current time: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}
