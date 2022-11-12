package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem{
    public Windows10(int publicationDate) {
        super(publicationDate);
    }
    @Override
    public void turnOn() {
        System.out.println("Turning on System published in " + getDate());
    }

}

