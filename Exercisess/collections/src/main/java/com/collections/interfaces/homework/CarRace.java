package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        AlfaRomeo alfaRomeo = new AlfaRomeo(120);
        System.out.println("Alfa Romeo speed is");
        doRace(alfaRomeo);
        Car audi = new Audi(110);
        System.out.println("Audi speed is");
        doRace(audi);
        Car ford = new Ford(90);
        System.out.println("Ford speed is");
        doRace(ford);
    }




    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
