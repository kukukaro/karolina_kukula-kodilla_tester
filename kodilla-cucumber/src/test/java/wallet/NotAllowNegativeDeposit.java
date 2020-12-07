package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class NotAllowNegativeDeposit implements En {

    private Wallet wallet = new Wallet();
    private Exception errorResponse;

    public NotAllowNegativeDeposit() {

        Given("There is 50$ in wallet", () -> {

            wallet.deposit(50);
            Assert.assertEquals(50, wallet.getBalance());
        });

        When("I try to deposit -1\\$", () -> {
            try {
                wallet.deposit(-1);
            } catch (Exception ex) {
                this.errorResponse = ex;
            }
        });

        Then("The deposit is rejected", () -> {
            Assert.assertEquals(50, wallet.getBalance());
        });

        Then("I get a negative deposit error message", () -> {
            Assert.assertEquals("Deposit can not be negative.", errorResponse.getMessage());
        });
    }
}
