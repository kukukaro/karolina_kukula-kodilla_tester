package com.kodilla.abstracts.homework.job;

import java.time.LocalDate;

public class Person {
    private String name;
    private int id;
    private int age;
    private LocalDate hiringDate;
    private Job job;

    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        hiringDate = LocalDate.now();
    }

    public void printPersonData(){
        System.out.println("Name: " + name + "\tID: " + id + "\tHiring Date: " + hiringDate);
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void printResponsibilities(){
        if (job == null){
            System.out.println("This employee has been not assigned any responsibilities yet.");
            return;
        }
        System.out.println(name + "'s responsibilities are " + job.getResponsibilities() + ".\n");
    }
}
