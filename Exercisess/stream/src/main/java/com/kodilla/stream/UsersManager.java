package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
//        UsersRepository.getUsersList() //wywołujemy metodę, która zwraca nam ArrayList obiektów typu User
        List<String>usernames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName) // referencje metody
//              .map(u -> u.getUsername()) // operacja transformująca
//              .forEach(un -> System.out.println(un )); // wyrażenie terminalne kolektor konczy stream
                .collect(Collectors.toList());
                System.out.println(usernames);
    }

    public static String getUserName(User user){
        return user.getUsername();
    }
}
