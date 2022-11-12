package com.kodilla.optional.homework;

public class Teacher {
    private String teacherName;

    public Teacher(String name) {
        this.teacherName = name;
    }

    public String getName() {
        return teacherName;
    }

    @Override
    public String toString() {
        return "Teacher: " + teacherName ;
    }
}
