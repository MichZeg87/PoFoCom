package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);

    @Test
    public void shouldAddItemsToInvoice() {
        //given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);
        //When
        int numberOfItems = invoice.getSize();
        //then
        assertEquals(3, numberOfItems);
    }

    @Test
    public void shouldGetItemsOfInvoice() {
        //given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);
        //when
        Item result = invoice.getItem(0);
        //then
        assertEquals("Milk", result.getName());
        assertEquals(3.5, result.getPrice());
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        //given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);
        //when
        Item result = invoice.getItem(-1);
        //then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        //given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);
        //when
        Item result = invoice.getItem(128);
        //then
        assertNull(result);
    }

    @Test
    public void shouldClearInvoice() {
        //given
//        Invoice invoice = new Invoice();
//        Item milk = new Item("Milk", 3.50);
//        Item eggs = new Item("Eggs", 8.00);
//        Item bread = new Item("Bread", 4.15);
//        invoice.addItem(milk);
//        invoice.addItem(eggs);
//        invoice.addItem(bread);
        //When
        invoice.clear();
        //then
        assertEquals(0, invoice.getSize());

    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}