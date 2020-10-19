package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Order order = new Order(99.99, LocalDate.of(2020,10,10), "Karo1");


    @Test
    public void shouldReturnOrderValue() {
        assertEquals(99.99, order.getValue());
    }

    @Test
    public void shouldReturnOrderDate() {
        assertEquals(LocalDate.of(2020, 10, 10), order.getDate());
    }

    @Test
    public void shouldReturnLoginFromOrder() {
        assertEquals("Karo1", order.getLogin());
    }


}