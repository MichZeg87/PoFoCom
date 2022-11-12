package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getorder(LocalDate beginning, LocalDate end) {
        return orders.stream().filter(n -> n.getOrderDate().isBefore(end))
                .filter(n -> n.getOrderDate().isAfter(beginning))
                .collect(Collectors.toList());


    }

    public List<Order> valueRange(int minValue, int maxValue) {
        return orders.stream().filter(n -> n.getOrderValue() < maxValue)
                .filter(n -> n.getOrderValue() > minValue)
                .collect(Collectors.toList());


    }

    public int getSize() {
        return this.orders.size();
    }

    public int valueSum() {
        return orders.stream().map(n -> n.getOrderValue())
                .mapToInt(n -> n)
                .sum();


    }
}
