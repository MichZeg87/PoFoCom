package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
   public static List<Task> getTasks(){
       List<Task> tasks = new ArrayList<>();
       tasks.add(new Task("change tyres to winter tyres", LocalDate.of(2021,11,13),LocalDate.of(2021,11,14)));
       tasks.add(new Task("Make an order", LocalDate.of(2021,11,14), LocalDate.of(2021,11,16)));
       tasks.add(new Task("Book a cheap flight", LocalDate.of(2021,10,29), LocalDate.of(2021,11,05)));
       return tasks;
   }


}
