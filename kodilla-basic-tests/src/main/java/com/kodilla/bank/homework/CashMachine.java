package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int numberOfTransactions;

    public CashMachine() {
        this.numberOfTransactions = 0;
        this.transactions = new int[0];
    }

    private void newTransaction(int amount) {
        this.numberOfTransactions++;
        int[] newTab = new int[this.numberOfTransactions];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.numberOfTransactions - 1] = amount;
        this.transactions = newTab;
    }

    public void newWithdraw(int amount){
        if (amount > 0){
            newTransaction(-amount);
        } else {
            System.out.println("The amount should be positive value.");
        }
    }

    public void newDeposit(int amount) {
        if (amount > 0){
            newTransaction(amount);
        } else {
            System.out.println("The amount should be positive value.");
        }
    }

    public int getSum() {
        if (transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int transaction : transactions)  {
            sum += transaction;
        }
        return sum;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int getNumberOfWithdraws() {
        if (transactions.length == 0){
            return 0;
        }
        int counter = 0;
        for (int transaction : transactions) {
            if (transaction < 0) counter++;
        }
            return counter;
    }

    public int getNumberOfDeposits() {
        if (transactions.length == 0){
            return 0;
        }
        int counter = 0;
        for (int transaction : transactions) {
            if (transaction > 0) counter++;
        }
        return counter;
    }

    public int getSumOfWithdraws() {
        if (transactions.length == 0){
            return 0;
        }
        int sum = 0;
        for (int transaction : transactions) {
            if (transaction < 0) {
                sum += transaction;
            };
        }
        return sum;
    }

    public int getSumOfDeposits() {
        if (transactions.length == 0){
            return 0;
        }
        int sum = 0;
        for (int transaction : transactions) {
            if (transaction > 0) {
                sum += transaction;
            };
        }
        return sum;
    }
}
