package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] atms;

    public Bank(int numberOfAtms){
        atms = new CashMachine[numberOfAtms];
        for (int i = 0 ; i <numberOfAtms ; i++){
            atms[i] = new CashMachine();
        }
    }

    public int returnAtmsSum(){
        int sum = 0;
        for (CashMachine atm : atms) {
            sum += atm.getSum();
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

    private int returnSumOfDeposits() {
        int sum = 0;
        for (CashMachine atm : atms) {
            sum += atm.getSumOfDeposits();
        }
        return sum;
    }

    private int returnSumOfWithdraws() {
        int sum = 0;
        for (CashMachine atm : atms) {
            sum += atm.getSumOfWithdraws();
        }
        return sum;
    }

    public double returnAverageOfWithdraws()
    {
        return returnSumOfWithdraws()/returnNumberOfWithdraws();
    }

    public double returnAverageOfDeposits()
    {
        return returnSumOfDeposits()/returnNumberOfDeposits();
    }

    public CashMachine accessAtm(int i){
        return atms[i];
    }
}
