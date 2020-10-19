package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    Invoice invoice = new Invoice();

    @BeforeEach
    public void initInvoices() {
        invoice.addItem(new Item("Saddle", 999.00));
        invoice.addItem(new Item("Wheel", 1699.00));
    }


    @Test
    public void shouldAddNewItemToInvoice() {
        assertEquals(2, invoice.getSize());
    }


    @Test
    public void shouldReturnItemName() {
        assertEquals("Wheel", invoice.getItem(1).getName());
    }

    @Test
    public void shouldReturnItemPrice() {
        assertEquals(999.00, invoice.getItem(0).getPrice());
    }

    @Test
    public void shouldReturnNullForNegativeIndex() {
        assertNull( invoice.getItem(-1));
    }

    @Test
    public void shouldReturnNullForIndexOutOfList() {
        assertNull( invoice.getItem(4));
    }

    @Test
    public void shouldClearItemsFromInvoice() {
        invoice.clear();
        assertEquals(0, invoice.getSize());
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