package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankCalculateAverage {
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
    public void shouldCorrectCalculateAverageValueOfDepositsTransaction() {
        assertEquals(380,bank.returnAverageOfDeposits());
    }

    @Test
    public void shouldReturnZeroAverageValueOfDepositsForNoTransaction() {
        assertEquals(0,bankZeroAtm.returnAverageOfDeposits());
    }

    @Test
    public void shouldReturnZeroAverageValueOfDepositsForZeroValueTransaction() {
        assertEquals(0,bankZeroValue.returnAverageOfDeposits());
    }

    @Test
    public void shouldReturnZeroAverageValueOfDepositsForNegativeValueTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newDeposit(-300);
        bank1.accessAtm(1).newDeposit(-50);

        assertEquals(0,bank1.returnAverageOfDeposits());
    }

    @Test
    public void shouldCorrectCalculateAverageValueOfWithdrawsTransaction() {
        assertEquals(-350, bank.returnAverageOfWithdraws());
    }

    @Test
    public void shouldReturnZeroAverageValueOfWithdrawsForNoTransaction() {
        assertEquals(0,bankZeroAtm.returnAverageOfWithdraws());
    }

    @Test
    public void shouldReturnZeroAverageValueOfWithdrawsForZeroValueTransactions() {
        assertEquals(0,bankZeroValue.returnAverageOfWithdraws());
    }

    @Test
    public void shouldReturnZeroAverageValueOfWithdrawsForNegativeValueTransactions() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(-300);
        bank1.accessAtm(1).newWithdraw(-50);

        assertEquals(0,bank1.returnAverageOfWithdraws());
    }
}
