package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {
        Bank bank1 = new Bank(4);
        bank1.accessAtm(0).newDeposit(400);
        bank1.accessAtm(2).newWithdraw(100);
        bank1.accessAtm(1).newWithdraw(200);

        System.out.println(bank1.returnAtmsSum());
        System.out.println(bank1.returnNumberOfDeposits());
        System.out.println(bank1.returnNumberOfWithdraws());
        System.out.println(bank1.returnAverageOfDeposits());
        System.out.println(bank1.returnAverageOfWithdraws());
    }
}
