package com.kodilla.exception.homework;


public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("first"));
        warehouse.addOrder(new Order("Second"));
        warehouse.addOrder(new Order("third"));
        try {
            Order isOrderExist = warehouse.getOrder("first");
            System.out.println(("Four status " + isOrderExist));

        } catch (
                OrderDoesntExistException e) {
            System.out.println("Sorry, we don`t have this order.");

        } finally {
            System.out.println("Thank you for using our service");
        }

    }
}
