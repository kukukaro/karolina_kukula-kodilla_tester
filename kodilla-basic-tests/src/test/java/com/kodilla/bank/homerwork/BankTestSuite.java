package com.kodilla.bank.homerwork;

import com.kodilla.bank.homework.Bank;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

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

    @Test
    public void shouldCalculateSum() {
        Bank bank1 = new Bank(3);
        bank1.accessAtm(0).newWithdraw(300);
        bank1.accessAtm(0).newDeposit(200);
        bank1.accessAtm(1).newWithdraw(300);
        bank1.accessAtm(1).newDeposit(200);
        bank1.accessAtm(2).newWithdraw(300);
        bank1.accessAtm(2).newDeposit(200);

        assertEquals(-300, bank1.returnAtmsSum());
    }

    @Test
    public void shouldReturnZeroSumForZeroAtms() {
        Bank bank1 = new Bank(0);

        assertEquals(0, bank1.returnAtmsSum());
    }

    @Test
    public void shouldReturnZeroSumForZeroValueTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(0);
        bank1.accessAtm(0).newDeposit(0);
        bank1.accessAtm(1).newWithdraw(0);
        bank1.accessAtm(1).newDeposit(0);

        assertEquals(0, bank1.returnAtmsSum());
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
    public void shouldReturnCorrectNumberOfDepositTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(200);
        bank1.accessAtm(0).newDeposit(100);
        bank1.accessAtm(1).newWithdraw(300);
        bank1.accessAtm(1).newDeposit(30);
        bank1.accessAtm(0).newDeposit(50);

        assertEquals(3, bank1.returnNumberOfDeposits());
    }

    @Test
    public void shouldReturnZeroForNoDepositTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(200);
        bank1.accessAtm(1).newWithdraw(300);

        assertEquals(0, bank1.returnNumberOfDeposits());
    }

    @Test
    public void shouldReturnZeroForZeroValueDepositTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newDeposit(0);
        bank1.accessAtm(1).newDeposit(0);

        assertEquals(0, bank1.returnNumberOfDeposits());
    }

    @Test
    public void shouldReturnZeroForNegativeValueDepositTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newDeposit(-300);
        bank1.accessAtm(1).newDeposit(-400);

        assertEquals(0, bank1.returnNumberOfDeposits());
    }

    @Test
    public void shouldReturnCorrectNumberOfWithdrawTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(200);
        bank1.accessAtm(0).newDeposit(100);
        bank1.accessAtm(1).newWithdraw(300);
        bank1.accessAtm(1).newDeposit(30);
        bank1.accessAtm(0).newDeposit(50);

        assertEquals(2, bank1.returnNumberOfWithdraws());
    }

    @Test
    public void shouldReturnZeroForNoWithdrawTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newDeposit(200);
        bank1.accessAtm(1).newDeposit(300);

        assertEquals(0, bank1.returnNumberOfWithdraws());
    }

    @Test
    public void shouldReturnZeroForZeroValueWithdrawTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(0);
        bank1.accessAtm(1).newWithdraw(0);

        assertEquals(0, bank1.returnNumberOfWithdraws());
    }

    @Test
    public void shouldReturnZeroForNegativeValueWithdrawTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(-300);
        bank1.accessAtm(1).newWithdraw(-400);

        assertEquals(0, bank1.returnNumberOfWithdraws());
    }

    @Test
    public void shouldCorrectCalculateAverageValueOfDepositTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newDeposit(200);
        bank1.accessAtm(0).newDeposit(300);
        bank1.accessAtm(1).newDeposit(100);
        bank1.accessAtm(1).newWithdraw(100);
        bank1.accessAtm(1).newWithdraw(100);

        assertEquals(200,bank1.returnAverageOfDeposits());
    }

    @Test
    public void shouldReturnZeroAverageValueOfDepositForNoTransaction() {
        Bank bank1 = new Bank(2);

        assertEquals(0,bank1.returnAverageOfDeposits());
    }

    @Test
    public void shouldReturnZeroAverageValueOfDepositForZeroValueTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newDeposit(0);
        bank1.accessAtm(1).newDeposit(0);

        assertEquals(0,bank1.returnAverageOfDeposits());
    }

    @Test
    public void shouldReturnZeroAverageValueOfDepositForNegativeValueTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newDeposit(-300);
        bank1.accessAtm(1).newDeposit(-50);

        assertEquals(0,bank1.returnAverageOfDeposits());
    }

    @Test
    public void shouldCorrectCalculateAverageValueOfWithdrawTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newDeposit(200);
        bank1.accessAtm(0).newDeposit(300);
        bank1.accessAtm(0).newWithdraw(400);
        bank1.accessAtm(1).newDeposit(100);
        bank1.accessAtm(1).newWithdraw(100);
        bank1.accessAtm(1).newWithdraw(100);

        assertEquals(200,bank1.returnAverageOfWithdraws());
    }

    @Test
    public void shouldReturnZeroAverageValueOfWithdrawForNoTransaction() {
        Bank bank1 = new Bank(2);

        assertEquals(0,bank1.returnAverageOfWithdraws());
    }

    @Test
    public void shouldReturnZeroAverageValueOfWithdrawForZeroValueTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(0);
        bank1.accessAtm(1).newWithdraw(0);

        assertEquals(0,bank1.returnAverageOfWithdraws());
    }

    @Test
    public void shouldReturnZeroAverageValueOfWithdrawForNegativeValueTransaction() {
        Bank bank1 = new Bank(2);
        bank1.accessAtm(0).newWithdraw(-300);
        bank1.accessAtm(1).newWithdraw(-50);

        assertEquals(0,bank1.returnAverageOfWithdraws());
    }
}
