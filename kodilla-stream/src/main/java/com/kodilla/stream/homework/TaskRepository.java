package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> listOfTasks = new ArrayList<>();
        listOfTasks.add(new Task("bake a cake", LocalDate.of(2020,10,01), LocalDate.of(2020, 10, 5)));
        listOfTasks.add(new Task("do the dusting", LocalDate.of(2020, 10,05), LocalDate.of(2020,10,9)));
        listOfTasks.add(new Task("wash the dishes", LocalDate.of(2020, 10, 06), LocalDate.of(2020,10, 8)));
        listOfTasks.add(new Task("do the vacuuming", LocalDate.of(2020, 10, 02), LocalDate.of(2020, 10, 10)));
        return listOfTasks;
    }
}
