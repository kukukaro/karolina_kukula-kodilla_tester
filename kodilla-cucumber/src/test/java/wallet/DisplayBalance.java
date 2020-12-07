package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalance implements En {
    private Wallet wallet = new Wallet();

    public DisplayBalance() {

        Given("there is $300 in my wallet", () -> {

            wallet.deposit(300);
            Assert.assertEquals(300, wallet.getBalance());
        });

        When("I check the balance of my wallet", () -> {
            wallet.getBalance();
        });

        Then("I should see that the balance is $300", () -> {
            Assert.assertEquals(300, wallet.getBalance());
        });

    }
}
