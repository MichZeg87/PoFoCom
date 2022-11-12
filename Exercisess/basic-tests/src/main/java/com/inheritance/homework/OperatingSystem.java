package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publicationDate;

    public OperatingSystem(int publicationDate){
        this.publicationDate = publicationDate;
    }

    public void turnOn(){
       System.out.println("Turning on");
    }

    public void turnOff() {
       System.out.println("Turning off");
    }

    public int getDate(){
        return publicationDate;
    }
}
