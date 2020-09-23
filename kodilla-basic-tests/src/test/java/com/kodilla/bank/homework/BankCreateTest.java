package com.kodilla.bank.homework;

import com.kodilla.bank.homework.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankCreateTest {
    @Test
    public void shouldAllowBankWithNoAtms() {
        Bank bank1 = new Bank(0);

        assertEquals(0, bank1.getNumberOfAtms());
    }

    @Test
    public void shouldNotAllowBankWithNegativeNumbersAtms() {
        Bank bank1 = new Bank(-1);

        assertEquals(0, bank1.getNumberOfAtms());
    }

    @Test
    public void shouldCreateBankWithCorrectNumbersAtms() {
        Bank bank1 = new Bank(3);

        assertEquals(3, bank1.getNumberOfAtms());
    }

    @Test
    public void shouldNotAllowAccessAtmWithNegativeIndex() {
        Bank bank1 = new Bank(2);

        assertEquals( null, bank1.accessAtm(-3));
    }
}
