package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class NotExceedDeposit implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private String response ;

    public NotExceedDeposit() {

        Given("there is $100 in my wallet", () -> {

            wallet.deposit(100);
            Assert.assertEquals(100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            response = cashier.withdraw(wallet, 200);
        });

        Then("100$ should be dispensed", () -> {
            Assert.assertEquals(100, cashSlot.getContents());
        });

        Then("I should be told that I withdraw the maximum amount of money available in your wallet.", () -> {
            Assert.assertEquals(0, wallet.getBalance());
            Assert.assertEquals("Withdraw the maximum amount of money available in your wallet.", response );
        });
    }

}
