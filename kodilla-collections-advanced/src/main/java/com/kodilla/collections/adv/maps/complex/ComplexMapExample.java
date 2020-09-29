package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();

        Student janek = new Student("Jan", "Kolasa");
        Student zenek = new Student("Zenon", "Martyniuk");
        Student zosia = new Student("Zofia", "Samosia");

        Grades janekGrades = new Grades(3.0, 5.0, 4,5, 3.5);
        Grades zenekGrades = new Grades(4.0, 4.5, 4.0);
        Grades zosiaGrades = new Grades(3.0, 5.0, 5.0, 5.0);

        school.put(janek, janekGrades);
        school.put(zenek, zenekGrades);
        school.put(zosia, zosiaGrades);



        for (Map.Entry<Student, Grades> studentGradesEntry : school.entrySet()) {
            System.out.println(studentGradesEntry.getKey().getFirstName() + ", average: " +
                    studentGradesEntry.getValue().getAverage());
        }

    }




}
