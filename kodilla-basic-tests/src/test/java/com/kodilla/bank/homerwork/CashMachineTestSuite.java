package com.kodilla.bank.homerwork;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine transactions = new CashMachine();
        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldAddTwoTransactionsToArray() {
        CashMachine transactions = new CashMachine();
        transactions.newWithdraw(300);
        transactions.newDeposit(500);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(2, numberOfTransactions);
        assertEquals(500, transactions.getSumOfDeposits());
        assertEquals(-300, transactions.getSumOfWithdraws());
    }

    @Test
    public void shouldNotAddNegativeValue() {
        CashMachine transactions = new CashMachine();
        transactions.newDeposit(-1);
        transactions.newWithdraw(-55);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
        assertEquals(0, transactions.getSumOfDeposits());
        assertEquals(0, transactions.getSumOfWithdraws());
    }

    @Test
    public void shouldNotAddZeroValue() {
        CashMachine transactions = new CashMachine();
        transactions.newWithdraw(0);
        transactions.newDeposit(0);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
        assertEquals(0, transactions.getSumOfDeposits());
        assertEquals(0, transactions.getSumOfWithdraws());

    }


}
