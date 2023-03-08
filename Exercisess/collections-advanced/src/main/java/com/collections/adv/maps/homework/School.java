package com.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> school = new ArrayList<>();
    private String name;

    public School(String name, int... school) {
        this.name = name;
        for (int student : school)
            this.school.add(student);
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        double sum = 0;
        for (int student : school)
            sum += student;
        return (int) sum;
    }

    @Override
    public String toString() {
        return "Number of students is school: " +
                school.toString();
    }
}
