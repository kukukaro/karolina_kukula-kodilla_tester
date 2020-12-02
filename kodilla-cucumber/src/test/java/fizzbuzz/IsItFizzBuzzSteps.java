package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsItFizzBuzzSteps implements En {
    private int number;
    private String answer;

    public IsItFizzBuzzSteps() {

        Given("Your number is 0" , () -> {
            this.number = 0;
        });

        Given("Your number is 1", () -> {
            this.number = 1;
        });

        Given("Your number is 2", () -> {
            this.number = 2;
        });

        Given("Your number is 3", () -> {
            this.number = 3;
        });
        Given("Your number is 4", () -> {
            this.number = 4;
        });
        Given("Your number is 5", () -> {
            this.number = 5;
        });
        Given("Your number is 6", () -> {
            this.number = 6;
        });
        Given("Your number is 7", () -> {
            this.number = 7;
        });
        Given("Your number is 8", () -> {
            this.number = 8;
        });
        Given("Your number is 9", () -> {
            this.number = 9;
        });
        Given("Your number is 10", () -> {
            this.number = 10;
        });
        Given("Your number is 11", () -> {
            this.number = 11;
        });
        Given("Your number is 12", () -> {
            this.number = 12;
        });
        Given("Your number is 13", () -> {
            this.number = 13;
        });
        Given("Your number is 14", () -> {
            this.number = 14;
        });
        Given("Your number is 15", () -> {
            this.number = 15;
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
