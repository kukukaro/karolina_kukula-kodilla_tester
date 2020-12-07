package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class NotAllowNegativeWithdrawal implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private String response ;

    public NotAllowNegativeWithdrawal() {

        Given("There is 200$ in wallet", () -> {

            wallet.deposit(200);
            Assert.assertEquals(200, wallet.getBalance());
        });

        When("I try to withdraw -1\\$", () -> {
            Cashier cashier = new Cashier(cashSlot);
            response = cashier.withdraw(wallet, -1);
        });

        Then("The withdrawal is rejected", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I get a negative withdrawal error message", () -> {
            Assert.assertEquals(200, wallet.getBalance());

            Assert.assertEquals("No withdrawal. You can not withdraw negative value.", response );
        });
    }
}
