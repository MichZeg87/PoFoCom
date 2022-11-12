package com.kodilla.abstracts.homeworkJob;



public class Person {
    private String firstName;
    private int age;
    private Job job;


    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
        }



    public void showResponsibilities() {
        System.out.println(job.getResponsibilities());
    }

    public static void main(String[] args) {
        Person tester = new Person("Adam", 27, new Tester());
        System.out.println("The responsibility of " + tester.firstName + " is ");
        tester.showResponsibilities();
        Person driver = new Person("Tomasz", 21, new Driver());
        System.out.println("The responsibility of " + driver.firstName + " is ");
        driver.showResponsibilities();
        Person developer = new Person("Paulina", 32, new Developer());
        System.out.println("The responsibility of " + developer.firstName + " is ");
        developer.showResponsibilities();


        }
    }





