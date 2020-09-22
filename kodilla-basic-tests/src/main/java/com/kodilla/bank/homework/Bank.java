package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] atms;

    public Bank(int numberOfAtms) {
        if (numberOfAtms < 0) {
            numberOfAtms = 0;
            System.out.println("Negative number of ATMs is not allowed! Created bank with 0 ATM.");
        }
        atms = new CashMachine[numberOfAtms];
        for (int i = 0; i < numberOfAtms; i++) {
            atms[i] = new CashMachine();
        }

    }

    Bank(CashMachine[] atms) {
        this.atms =atms;
    }

    public int returnAtmsSum(){
        int sum = 0;
        for (CashMachine atm : atms) {
            sum += atm.getSaldo();
        }
        return sum;
    }

    public int returnNumberOfDeposits() {
        int counter = 0;
        for (CashMachine atm : atms) {
            counter += atm.getNumberOfDeposits();
        }
        return counter;
    }

    public int returnNumberOfWithdraws() {
        int counter = 0;
        for (CashMachine atm : atms) {
            counter += atm.getNumberOfWithdraws();
        }
        return counter;
    }

    public int returnSumOfDeposits() {
        int sum = 0;
        for (CashMachine atm : atms) {
            sum += atm.getSumOfDeposits();
        }
        return sum;
    }

    public int returnSumOfWithdraws() {
        int sum = 0;
        for (CashMachine atm : atms) {
            sum += atm.getSumOfWithdraws();
        }
        return sum;
    }

    public double returnAverageOfWithdraws()
    {
        if (returnNumberOfWithdraws() == 0){
            System.out.println("No transaction.");
            return  0;
        }
        return returnSumOfWithdraws()/returnNumberOfWithdraws();
    }

    public double returnAverageOfDeposits()
    {
        if (returnNumberOfDeposits() == 0){
            System.out.println("No transaction.");
            return  0;
        }
        return returnSumOfDeposits()/returnNumberOfDeposits();
    }

    public CashMachine accessAtm(int i){
        if (i < 0){
            System.out.println("Wrong number of ATM. Please input correct value: 0 or more.");
            return null;
        }
        return atms[i];
    }

    public int getNumberOfAtms() {
        return atms.length;
    }
}
