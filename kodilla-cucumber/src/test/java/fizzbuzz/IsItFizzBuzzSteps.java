package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzzSteps implements En {
    private int number;
    private String answer;

    public IsItFizzBuzzSteps() {


        Given("Your number is {int}", number -> {

            // Write code here that turns the phrase above into concrete actions
            this.number = (int) number;

        });

        When("I ask whether my number is Fizz, Buzz or FizzBuzz", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.checkIfIsFizzBuzz(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.answer);
        });
    }
}
