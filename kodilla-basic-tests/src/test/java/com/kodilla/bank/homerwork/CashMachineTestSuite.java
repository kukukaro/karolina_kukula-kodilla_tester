package com.kodilla.bank.homerwork;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldInitWithZeroLength() {
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

    @Test
    public void shouldCalculateSaldo() {
        CashMachine transactions = new CashMachine();
        transactions.newDeposit(200);
        transactions.newDeposit(100);
        transactions.newWithdraw(500);
        transactions.newWithdraw(200);

        assertEquals(-400, transactions.getSaldo());
    }

    @Test
    public void shouldReturnSaldoZeroForNoneTransaction(){
        CashMachine transactions = new CashMachine();

        assertEquals(0, transactions.getNumberOfTransactions());
        assertEquals(0, transactions.getSaldo());
    }

    @Test
    public void shouldReturnSaldoZeroForZeroValueTransactions(){
        CashMachine transactions = new CashMachine();
        transactions.newWithdraw(0);
        transactions.newDeposit(0);

        assertEquals(0, transactions.getSaldo());
    }

    @Test
    public void shouldReturnSaldoZeroForNegativeTransactions(){
        CashMachine transactions = new CashMachine();
        transactions.newWithdraw(-42);
        transactions.newDeposit(-300);

        assertEquals(0, transactions.getSaldo());
    }

    @Test
    public void shouldReturnNumberOfTransactions() {
        CashMachine transactions = new CashMachine();
        transactions.newDeposit(200);
        transactions.newDeposit(100);
        transactions.newWithdraw(500);
        transactions.newWithdraw(200);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(4, numberOfTransactions );
    }

    @Test
    public void shouldReturnZeroNumberOfTransactionForNoneTransaction() {
        CashMachine transactions = new CashMachine();

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions );
    }

    @Test
    public void shouldReturnZeroNumberOfTransactionZeroValueTransaction() {
        CashMachine transactions = new CashMachine();
        transactions.newDeposit(0);
        transactions.newWithdraw(0);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions );
    }

    @Test
    public void shouldReturnZeroNumberOfTransactionNegativeTransaction() {
        CashMachine transactions = new CashMachine();
        transactions.newDeposit(-350);
        transactions.newWithdraw(-150);

        int numberOfTransactions = transactions.getNumberOfTransactions();
        assertEquals(0, numberOfTransactions );
    }
}
