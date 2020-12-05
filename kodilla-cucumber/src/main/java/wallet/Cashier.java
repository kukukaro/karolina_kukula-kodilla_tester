package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount > 0 && wallet.getBalance() >= amount) {
            cashSlot.dispense(amount);
        }
    }
}
