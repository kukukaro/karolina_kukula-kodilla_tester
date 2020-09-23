package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankCalculateSumTest {
    Bank bank = new Bank(new CashMachine[]{
            new CashMachine(new int[]{100, -200}),
            new CashMachine(new int[]{-500, 300, 600}),
            new CashMachine(new int[]{400, 500})
    });
    Bank bankZeroAtm = new Bank(0);
    Bank bankZeroValue = new Bank(new CashMachine[]{
            new CashMachine(new int[]{0, 0})
    });
    Bank bankZeroWithdraws = new Bank(new CashMachine[]{
            new CashMachine(new int[]{100, 200}),
            new CashMachine(new int[]{200, 300})
    });
    Bank bankZeroDeposits = new Bank(new CashMachine[]{
            new CashMachine(new int[]{-100, -200}),
            new CashMachine(new int[]{-200, -300})
    });

    @Test
    public void shouldCalculateSum() {
        assertEquals(1200, bank.returnAtmsSum());
    }

    @Test
    public void shouldReturnZeroSumForZeroAtms() {
        assertEquals(0, bankZeroAtm.returnAtmsSum());
    }

    @Test
    public void shouldReturnZeroSumForZeroValueTransaction() {
        assertEquals(0, bankZeroValue.returnAtmsSum());
    }

    @Test
    public void shouldReturnZeroSumForNegativeValueTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(-200);
        bank1.accessAtm(0).newDeposit(-100);
        bank1.accessAtm(1).newWithdraw(-300);
        bank1.accessAtm(1).newDeposit(-20);

        assertEquals(0, bank1.returnAtmsSum());
    }

    @Test
    public void shouldReturnSumOfWithdraws() {
        assertEquals(-700, bank.returnSumOfWithdraws());
    }

    @Test
    public void shouldReturnZeroSumForNoWithdraws() {
        assertEquals(0, bankZeroWithdraws.returnSumOfWithdraws());
    }

    @Test
    public void shouldReturnSumOfDeposits() {
        assertEquals(1900, bank.returnSumOfDeposits());
    }

    @Test
    public void shouldReturnZeroSumForNoDeposits() {
        assertEquals(0, bankZeroDeposits.returnSumOfDeposits());
    }
}
