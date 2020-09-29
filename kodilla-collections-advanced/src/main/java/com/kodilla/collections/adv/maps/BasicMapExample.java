package com.kodilla.collections.adv.maps;

import java.util.HashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 5.0);
        grades.put("Physics", 4.5);
        grades.put("Philosopshy", 4.0);

        Double grade = grades.get("Physics");
        System.out.println(grade);

        for (Map.Entry<String, Double> stringDoubleEntry : grades.entrySet()) {
            System.out.println(stringDoubleEntry);

        }

        for (String s : grades.keySet()) {
            System.out.println(s);
        }

        for (Double value : grades.values()) {
            System.out.println(value);
        }
    }
}
