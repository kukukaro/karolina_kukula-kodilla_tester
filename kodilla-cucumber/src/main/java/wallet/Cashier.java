package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        if (amount > 0 && wallet.getBalance() >= amount) {
            cashSlot.dispense(amount);
            wallet.bookWithdrawal(amount);
            return "Successful withdrawal.";
        }

        if (amount <= 0) {
            return "No withdrawal. You can not withdraw negative value.";
        } else {
            cashSlot.dispense(wallet.getBalance());
            wallet.bookWithdrawal(wallet.getBalance());
            return "Withdraw the maximum amount of money available in your wallet.";
        }
    }

    public int currentBalance (Wallet wallet) {
         return wallet.getBalance();
    }
}
