package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import com.kodilla.exception.AirportRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseAppTest {
    @Test
    public void testisOrderExist() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("first"));
        // when
        Order isFirstExist = warehouse.getOrder("first");
        // then
        assertNotNull(isFirstExist);
        assertEquals("first",isFirstExist.getNumber() );
    }

    @Test
    public void testisOrderExist_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("four"));
    }

}