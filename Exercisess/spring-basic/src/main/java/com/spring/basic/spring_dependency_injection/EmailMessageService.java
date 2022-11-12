package com.spring.basic.spring_dependency_injection;

import com.spring.basic.dependency_injection.MessageService;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageService implements MessageService {

    @Override
    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " via Email";
    }
}
