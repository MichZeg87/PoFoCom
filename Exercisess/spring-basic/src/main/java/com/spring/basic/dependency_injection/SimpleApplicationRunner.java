package com.spring.basic.dependency_injection;

public class SimpleApplicationRunner {
    public static void main(String[] args) {
//        SimpleApplication application = new SimpleApplication(); //1
//        MessageService messageService = new MessageService(); //2
        MessageService messageService = new FacebookMessageService();//3
        SimpleApplication application = new SimpleApplication(messageService); // 2
        application.processMessage("Test message", "receiver@mail.com");
    }
}
