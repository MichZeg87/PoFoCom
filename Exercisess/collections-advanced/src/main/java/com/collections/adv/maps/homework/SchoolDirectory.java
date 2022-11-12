package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirector  =new HashMap<>();

        Principal johny = new Principal("John Carpenter");
        Principal jessie = new Principal("Jessica Adams");
        Principal bart = new Principal("James Cloverfield");

        School elementary = new School("elementary school", 40, 45, 50, 50);
        School high = new School("high school", 22, 11, 18, 21);
        School college = new School("college nr 25", 28, 31, 22, 26);

        schoolDirector.put(johny, elementary);
        schoolDirector.put(jessie, high);
        schoolDirector.put(bart, college);

        for (Map.Entry<Principal, School> principalSchoolEntry : schoolDirector.entrySet())
            System.out.println(principalSchoolEntry.getKey().getFirstname() + ", is a director of  " +
                     principalSchoolEntry.getValue().getName() +", and have " + principalSchoolEntry.getValue().getSum()+" Students" );
    }


}
