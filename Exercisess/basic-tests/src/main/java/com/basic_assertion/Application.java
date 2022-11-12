package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int subtResult = calculator.subtract(a, b);
        double squareResult = calculator.square(a);
        boolean correct = ResultChecker.assertEquals(13, sumResult,1);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSub = ResultChecker.assertEquals(-3, subtResult, 1);
        if (correctSub) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        boolean correctSquare = ResultChecker.assertEquals(25, squareResult,1 );
        if (correctSquare){
            System.out.println("Metoda square działa poprawnie dla liczby " + a );
        }else {
            System.out.println("Metoda square nie działa poprawnie dla liczb " + a);
        }
    }
}
