package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Shape surfaceAreaTriangle = new EquilateralTriangle();
        int triangleSurfaceArea = surfaceAreaTriangle.calcSurfaceArea();

        Shape trianglePerimeter = new EquilateralTriangle();
        int perimeterTriangle = trianglePerimeter.calcPerimeter();

        System.out.println("The surface area of the equilateral triangle is " + triangleSurfaceArea +
          " And the perimeter is " + perimeterTriangle);

        Shape surfaceRectangle = new Rectangle();
        int rectangleSurfaceArea = surfaceRectangle.calcSurfaceArea();

        Shape rectanglePerimeter = new Rectangle();
        int rectanglePeri = rectanglePerimeter.calcPerimeter();

        System.out.println("The surface area of the rectangle is " + rectangleSurfaceArea +
                " And the perimeter is " + rectanglePeri);

        Shape surfaceSquare = new Square();
        int squareSurfaceArea  = surfaceSquare.calcSurfaceArea();

        Shape periSquare = new Square();
        int squarePerimeter = periSquare.calcPerimeter();

        System.out.println("The surface area of the square is " + squareSurfaceArea +
                " And the perimeter is " + squarePerimeter);
    }
}
