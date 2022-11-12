package com.kodilla.stream.homework;

import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> tasks = TaskRepository.getTasks()
         .stream()
         .filter(t -> t.getDeadline().isAfter(currentDate))
         .map(t -> t.getDeadline()) 
         .collect(Collectors.toList());
        System.out.println(tasks);
    }
}
