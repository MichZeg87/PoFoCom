package com.spring.basic.dependency_injection;

public interface MessageService {
     String send(String message, String receiver);

// public class MessageService
//    public void send(String message, String receiver) {
//        System.out.println("Sending message [" + message + "] to: " + receiver);
//    }
}
