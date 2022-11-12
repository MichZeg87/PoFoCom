package com.kodilla.inheritance.homework;

public class App {
    public static void main(String[] args) {
        Windows10 win10 = new Windows10(2012);
        win10.turnOn();

        IOS15 iOS = new IOS15(2021);
        iOS.turnOff();

    }
}



