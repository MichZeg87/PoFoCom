package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private int orderValue;
    private String login;
    private LocalDate orderDate;

    public Order(int orderValue, String login, LocalDate orderDate) {
        this.orderValue = orderValue;
        this.login = login;
        this.orderDate = orderDate;
    }

    public int getOrderValue() {
        return orderValue;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderValue == order.orderValue && Objects.equals(login, order.login) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderValue, login, orderDate);
    }
}
