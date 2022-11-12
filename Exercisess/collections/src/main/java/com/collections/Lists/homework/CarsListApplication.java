package com.kodilla.collections.Lists.homework;


import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.AlfaRomeo;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car alfaRomeo = new AlfaRomeo(260);
        Car audi = new Audi(240);
        Car ford  = new Ford(180);

        cars.add(alfaRomeo);
        cars.add(ford);
        cars.add(audi);

        cars.remove(2);
        cars.remove(new Ford(180));

        System.out.println("The size of Car Array list is " + cars.size());
        for (Car car: cars) {
            CarUtils.describeCar(car);
          }
    }
}
