package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> school = new ArrayList<>();
    private String name = "";

    public School(String name, int ... school) {
        for (Integer studentsInClass : school) {
            this.school.add(studentsInClass);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int numberOfStudents() {
        int sum = 0;
        for (Integer integer : school) {
            sum += integer;
        }
        return sum;
    }



    @Override
    public String toString() {
        return "School{" +
                "studenents=" + school +
                '}';
    }
}
