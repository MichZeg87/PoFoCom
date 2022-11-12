package com.spring.basic.dependency_injection.homework;

public class SmsNotificationService implements NotificationService {
    @Override
    public String success(String address) {
        System.out.println("Package delivered to: " + address);
        return address;
    }
    @Override
    public String fail(String address) {
        System.out.println("Package not delivered to: " + address);
        return address;
    }
}
