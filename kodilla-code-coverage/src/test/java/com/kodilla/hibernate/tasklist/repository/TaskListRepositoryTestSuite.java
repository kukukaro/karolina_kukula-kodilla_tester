package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Testing Description";

    private TaskList removeAfterTest;

    @Test
    public void testTaskRepositoryFindByListName() {
        //Given
        TaskList taskList = new TaskList("First list", DESCRIPTION);
        removeAfterTest = taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListRepository.findByListName(listName);

        //Then
        Assert.assertEquals(1, readTaskList.size());
    }

    @AfterEach
    public void cleanUp() {
        if(removeAfterTest != null) {
            taskListRepository.deleteById(removeAfterTest.getId());
        }
    }
}
