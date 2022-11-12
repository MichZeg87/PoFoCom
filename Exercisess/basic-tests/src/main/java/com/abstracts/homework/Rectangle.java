package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public Rectangle() {
        super(2, 4);
    }

    @Override
    public int calcSurfaceArea() {
       int result = getBase() * getHeight();
        return result;
    }

    @Override
    public int calcPerimeter() {
        int result = (2 * getBase()) + (2 * getHeight());
        return result;
    }


}
