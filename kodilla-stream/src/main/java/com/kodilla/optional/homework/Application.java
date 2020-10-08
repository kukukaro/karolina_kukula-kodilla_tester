package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Teacher teacher01 = new Teacher("Piotr Bąk");
        Teacher teacher02 = new Teacher("Lila Dzik");
        students.add(new Student("Marek Loś", teacher01));
        students.add(new Student("Julia Nos", teacher01));
        students.add(new Student("Szymon Ktoś", null));
        students.add(new Student("Arek Kogut", teacher02));
        students.add(new Student("Zygmunt Franciszek", null));

        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            System.out.println("Student: " + student.getName() + " - Teacher: " + teacher.orElse(new Teacher("<undefined>")).getName());
        }

        for (Student student : students) {
            Optional<Teacher> teacher = Optional.ofNullable(student.getTeacher());
            System.out.println("Student: " + student.getName() + " - Teacher: " + teacher.map(t -> t.getName()).orElse("<undefined2>"));
        }

    }
}
