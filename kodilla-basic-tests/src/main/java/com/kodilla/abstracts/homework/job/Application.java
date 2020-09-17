package com.kodilla.abstracts.homework.job;

import java.lang.reflect.Member;

public class Application {

    public static void main(String[] args) {
        Person person1 = new Person("Anna",1, 22);
        Job administrator1 = new Administrator(5000, "creating daily unallocated report");
        person1.setJob(administrator1);
        person1.printPersonData();
        person1.printResponsibilities();

        Person person2 = new Person("Kamil", 2, 36);
        person2.setJob(new Coordinator(6000, "creating KPI's reports"));
        person2.printPersonData();
        person2.printResponsibilities();

        Person person3 = new Person("Dominika", 3, 41 );
        person3.setJob(new Leader (7000, "contact with managers, supporting all team"));
        person3.printPersonData();
        person3.printResponsibilities();

        Person person4 = new Person("Jerzy", 4, 37);
        person4.setJob(new Manager(10000, "reporting directly to CFO and CEO"));
        person4.printResponsibilities();

        Person person5 = new Person("Kalina", 5, 24);
        person5.printResponsibilities();
    }
}
