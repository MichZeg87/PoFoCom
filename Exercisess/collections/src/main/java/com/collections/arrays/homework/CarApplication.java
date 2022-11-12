package com.kodilla.collections.arrays.homework;



import com.kodilla.collections.interfaces.homework.AlfaRomeo;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars) // "wykonaj pewną operację dla każdego elementu tablicy shapes".
            CarUtils.describeCar(car);

    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int a = random.nextInt(200) ;   // possible values: 1.000-100.999 ...
        int b = random.nextInt() * 100 + 11;
        int c = random.nextInt() * 100 + 11;
        if (drawnCarKind == 0)
            return new AlfaRomeo(a);
        else if (drawnCarKind == 1)
            return new Audi(a);
        else
            return new Ford(a);
    }

}


//    private static Shape drawShape() {
//        Random random3 = new Random();
//        int drawnShapeKind = random3.nextInt(3);
//        double a = random3.nextDouble() * 100 + 1;   // possible values: 1.000-100.999 ...
//        double b = random3.nextDouble() * 100 + 1;
//        double c = random3.nextDouble() * 100 + 1;
//        if (drawnShapeKind == 0)
//            return new Circle(a);
//        else if (drawnShapeKind == 1)
//            return new Square(a);
//        else
//            return new Triangle(a, b, c);
//    }