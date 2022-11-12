package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Carter", new Teacher("Andrew Michta")));
        students.add(new Student("Tonny Stark", null));
        students.add(new Student("Jessica Johns", new Teacher("Terry Shepard")));



        for (Student student : students) {
            System.out.println("Student: " + student.getName()+ " "+ student.getTeacher());

        }
    }
}
