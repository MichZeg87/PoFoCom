package com.kodilla.abstracts.homework;

public class EquilateralTriangle extends Shape {


    public EquilateralTriangle() {
        super(3, 5);
    }


    @Override
    public int calcSurfaceArea() {
        int result;
        result = getBase() * getHeight();
        return result;
    }

    @Override
    public int calcPerimeter() {
        int result = 0;
        result = getBase() * 3;
        return result;
    }
}
