package com.spring.basic.dependency_injection;

public class SimpleApplication {
//    private MessageService messageService = new MessageService(); //1

    private MessageService messageService; //2

    public SimpleApplication(MessageService messageService) { //2
        this.messageService = messageService;
    }
    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
