package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square() {
        super(7,7);
    }

    @Override
    public int calcSurfaceArea() {
        int result = getBase() * getBase();
        return result;
    }

    @Override
    public int calcPerimeter() {
        int result = 4 * getBase();
        return result;
    }
}
