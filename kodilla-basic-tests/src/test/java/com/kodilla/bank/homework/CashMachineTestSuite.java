package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    CashMachine correctTransaction = new CashMachine(new int[]{100, 200, 300, -200, -300, -400, -500});
    CashMachine zeroValueTransaction = new CashMachine(new int[]{0, 0});
    CashMachine transactions = new CashMachine();

    @Test
    public void shouldInitWithZeroLength() {

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldAddTwoTransactionsToArray() {
        transactions.newWithdraw(300);
        transactions.newDeposit(500);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(2, numberOfTransactions);
    }

    @Test
    public void shouldNotAddNegativeValue() {
        transactions.newDeposit(-1);
        transactions.newWithdraw(-55);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldNotAddZeroValue() {
        transactions.newWithdraw(0);
        transactions.newDeposit(0);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldCalculateSaldo() {
        assertEquals(-800, correctTransaction.getSaldo());
    }

    @Test
    public void shouldReturnSaldoZeroForNoneTransaction() {
        assertEquals(0, transactions.getSaldo());
    }

    @Test
    public void shouldReturnSaldoZeroForZeroValueTransactions() {
        assertEquals(0, zeroValueTransaction.getSaldo());
    }

    @Test
    public void shouldReturnSaldoZeroForNegativeTransactions() {
        transactions.newWithdraw(-42);
        transactions.newDeposit(-300);

        assertEquals(0, transactions.getSaldo());
    }

    @Test
    public void shouldReturnNumberOfTransactions() {
        int numberOfTransactions = correctTransaction.getNumberOfTransactions();
        assertEquals(7, numberOfTransactions);
    }

    @Test
    public void shouldReturnZeroNumberOfTransactionForNoneTransaction() {
        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldReturnZeroNumberOfTransactionZeroValueTransaction() {
        int numberOfTransactions = zeroValueTransaction.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }

    @Test
    public void shouldReturnZeroNumberOfTransactionNegativeTransaction() {
        transactions.newDeposit(-350);
        transactions.newWithdraw(-150);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions);
    }
}
