package com.kodilla.inheritance.homework;

public class IOS15 extends OperatingSystem{
    public IOS15(int publicationDate) {
        super(publicationDate);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off System published in " + getDate());
    }
}
