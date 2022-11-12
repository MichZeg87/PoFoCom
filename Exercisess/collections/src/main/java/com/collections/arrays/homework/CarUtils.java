package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.AlfaRomeo;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car type: " + getCarType(car));
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Increase speed: " + car.increaseSpeed());
    }

    private static String getCarType(Car car) {
        if (car instanceof AlfaRomeo)
            return "Alfa Romeo";
        else if (car instanceof Audi)
            return "Audi";
        else if (car instanceof Ford)
            return "Ford";
        else
            return "Unknown Car";
    }
}
