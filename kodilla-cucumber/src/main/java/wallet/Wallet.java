package wallet;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        if (money > 0) {
            balance += money;
        } else {

        }
    }

    public int getBalance() {
        return balance;
    }
}
