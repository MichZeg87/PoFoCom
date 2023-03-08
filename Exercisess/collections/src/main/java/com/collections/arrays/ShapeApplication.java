package com.collections.arrays;

import com.collections.interfaces.Circle;
import com.collections.interfaces.Shape;
import com.collections.interfaces.Square;
import com.collections.interfaces.Triangle;


import java.util.Random;

public class ShapeApplication{
    Random random = new Random();
    int drawnNumber = random.nextInt(100);

    Random random2 = new Random();
    int drawnNumber2 = random2.nextInt(61) + 100;

    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[random.nextInt(20) + 1];
        for (int n = 0; n < shapes.length; n++)
            shapes[n] = drawShape();
        for ( Shape shape : shapes) // "wykonaj pewną operację dla każdego elementu tablicy shapes".
            ShapeUtils.displayShapeInfo(shape);
    }

    private static Shape drawShape() {
        Random random3 = new Random();
        int drawnShapeKind = random3.nextInt(3);
        double a = random3.nextDouble() * 100 + 1;   // possible values: 1.000-100.999 ...
        double b = random3.nextDouble() * 100 + 1;
        double c = random3.nextDouble() * 100 + 1;
        if (drawnShapeKind == 0)
            return new Circle(a);
        else if (drawnShapeKind == 1)
            return new Square(a);
        else
            return new Triangle(a, b, c);
    }



}
