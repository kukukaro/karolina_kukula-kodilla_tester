package wallet;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        balance += money;
    }

    public int getBalance() {
        return balance;
    }
}
