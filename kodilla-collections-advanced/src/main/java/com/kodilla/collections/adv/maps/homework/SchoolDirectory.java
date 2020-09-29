package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Director, School> principals = new HashMap<>();
        Director jefferson = new Director("Jack", "Jefferson");
        Director clue = new Director("Zoe", "Clue");
        Director mayer = new Director("Selina", "Mayer");

        School firstSchool = new School("First School",15, 18, 14, 20, 16);
        School secondSchool = new School("Second School",28, 30, 33, 32, 30);
        School thirdSchool = new School("Third School", 25, 24, 22, 24, 26);

        principals.put(jefferson, firstSchool);
        principals.put(clue, secondSchool);
        principals.put(mayer, thirdSchool);

        for (Map.Entry<Director, School> directorSchoolEntry : principals.entrySet()) {
            System.out.println("Director: " + directorSchoolEntry.getKey().getFirstName()+ " " +
                    directorSchoolEntry.getKey().getLastName() + "   ---   Name of school: " + directorSchoolEntry.getValue().getName()
            + " in NYC   ---   Number of students: " + directorSchoolEntry.getValue().numberOfStudents());
        }
    }
}
