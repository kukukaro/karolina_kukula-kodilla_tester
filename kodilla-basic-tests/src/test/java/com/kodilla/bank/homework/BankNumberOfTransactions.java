package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankNumberOfTransactions {
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
    public void shouldReturnCorrectNumberOfDepositsTransaction() {
        assertEquals(5, bank.returnNumberOfDeposits());
    }

    @Test
    public void shouldReturnZeroForNoDepositTransaction() {
        assertEquals(0, bankZeroDeposits.returnNumberOfDeposits());
    }

    @Test
    public void shouldReturnZeroForZeroValueDepositsTransaction() {
        assertEquals(0, bankZeroValue.returnNumberOfDeposits());
    }

    @Test
    public void shouldReturnZeroForNegativeValueDepositsTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newDeposit(-300);
        bank1.accessAtm(1).newDeposit(-400);

        assertEquals(0, bank1.returnNumberOfDeposits());
    }

    @Test
    public void shouldReturnCorrectNumberOfWithdrawsTransaction() {
        assertEquals(2, bank.returnNumberOfWithdraws());
    }

    @Test
    public void shouldReturnZeroForNoWithdrawsTransaction() {
        assertEquals(0, bankZeroWithdraws.returnNumberOfWithdraws());
    }

    @Test
    public void shouldReturnZeroForZeroValueWithdrawsTransaction() {
        assertEquals(0, bankZeroValue.returnNumberOfWithdraws());
    }

    @Test
    public void shouldReturnZeroForNegativeValueWithdrawTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(-300);
        bank1.accessAtm(1).newWithdraw(-400);

        assertEquals(0, bank1.returnNumberOfWithdraws());
    }

}
