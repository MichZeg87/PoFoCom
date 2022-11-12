//package com.kodilla.spring.basic.spring_dependency_injection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SimpleApplication2 {
////    @Autowired //wstrzykiwanie do pola
//    private SkypeMessageService messageService;
//
//    public String processMessage(String message, String receiver) {
//        if (checkReceiver(receiver)) {
//            return this.messageService.send(message, receiver);
//        }
//        return null;
//    }
//    @Autowired
//    public void setMessageService(SkypeMessageService messageService) {
//        this.messageService = messageService;
//    }
//
//    private boolean checkReceiver(String receiver) {
//        return receiver != null && !receiver.isEmpty();
//    }
//}
