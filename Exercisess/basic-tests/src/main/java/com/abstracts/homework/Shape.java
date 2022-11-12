package com.kodilla.abstracts.homework;

public abstract class Shape {

   private int base;
   private int height;

    public Shape(int base, int height) {
        this.height = height;
        this.base= base;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public abstract int calcSurfaceArea();

    public abstract int calcPerimeter();
}


