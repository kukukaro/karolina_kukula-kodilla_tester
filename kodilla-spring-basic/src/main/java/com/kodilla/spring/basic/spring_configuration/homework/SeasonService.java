package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Service;

@Service
public class SeasonService {

    public String season() {
        return "Summer";
    }

    public Integer hour() {
        return 8;
    }

}
