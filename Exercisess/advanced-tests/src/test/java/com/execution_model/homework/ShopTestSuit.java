package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShopTestSuit {
    Shop shop = new Shop();
    Order order1 = new Order(500, "Andrew", LocalDate.of(2021, 11, 13));
    Order order2 = new Order(1000, "Matthew", LocalDate.of(2021, 10, 2));
    Order order3 = new Order(2000, "Scott", LocalDate.of(2021, 10, 28));

    @BeforeEach
    public void initializeOrders() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void shouldAddOrderToShop() {
        //When
        int numberOfOrder = shop.getSize();
        //then
        assertEquals(3, numberOfOrder);
    }

    @Test
    public void shouldGetOrdersBetweenDate() {
        //when
        List<Order> result = shop.getorder(LocalDate.of(2021, 10, 1),
                LocalDate.of(2021, 10, 29));
        //then
        assertEquals(2, result.size());


    }

    @Test
    public void shouldGetOrdersMinAndMaxValue() {
        //when
        List<Order> result = shop.valueRange(500, 2000);
        //then
        assertEquals(1, result.size());

    }

    @Test
    public void shouldGetSumOfOrders() {
        int result = shop.valueSum();
        //then
        assertEquals(3500, result);

    }
}