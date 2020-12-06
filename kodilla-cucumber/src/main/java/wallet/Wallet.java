package wallet;

import java.util.Optional;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {

        if (money > 0) {
            balance += money;
        } else {
            throw new IllegalArgumentException("Deposit can not be negative.");
        }


    }

    public void bookWithdrawal(int money) {
        balance -= money;
    }

    public int getBalance() {
        return balance;
    }
}
