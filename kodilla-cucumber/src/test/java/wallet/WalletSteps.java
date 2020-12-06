package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;


public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private int deposit_amount;
    private int requested_amount;
    private int dispensed_amount;
    private int final_amount;


    public WalletSteps() {

        Given("Your deposit is {int}", (Integer deposit_amount) -> {
            this.deposit_amount = deposit_amount;
            if (deposit_amount > 0) {
                wallet.deposit(deposit_amount);
                Assert.assertEquals(this.deposit_amount, wallet.getBalance());
            }
        });

        When("I request {int}", (Integer requested_amount) -> {
            Cashier cashier = new Cashier(cashSlot);
            this.requested_amount = requested_amount;
            cashier.withdraw(wallet, this.requested_amount);
        });

        Then("{int} should be dispensed", (Integer dispensed_amount) -> {
            this.dispensed_amount = dispensed_amount;
            Assert.assertEquals(this.dispensed_amount, cashSlot.getContents());
        });

        Then("The balance of my wallet should be {int}", (Integer final_amount) -> {
            this.final_amount = final_amount;
            Assert.assertEquals(this.final_amount, wallet.getBalance());
        });
    }
}
