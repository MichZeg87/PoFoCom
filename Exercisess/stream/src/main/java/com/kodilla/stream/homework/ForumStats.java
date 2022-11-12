package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgAfterForty = UsersRepository.getUsersList()
                .stream()
                .filter(n->n.getAge()>=40 )
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("the average number of posts for users whose age is after or equal 40 is " + avgAfterForty);

        double avgBeforeForty = UsersRepository.getUsersList()
                .stream()
                .filter(n->n.getAge()<40 )
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("the average number of posts for users whose age is before 40 is " + avgBeforeForty);
    }
}
