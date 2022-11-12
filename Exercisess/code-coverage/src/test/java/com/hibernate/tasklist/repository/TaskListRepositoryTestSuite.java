package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Test: Hibernate homework";

    @Test
    void testFindByListName() {
        //Given
        TaskList list = new TaskList("To_Do", DESCRIPTION);
        taskListRepository.save(list);
        String name = list.getListName();

        //When
        List<TaskList> myLists = taskListRepository.findByListName(name);

        //Then
        Assertions.assertEquals(3, myLists.size());


    }
}
