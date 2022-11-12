package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class isDivisibleBySteps implements En {
    Integer number;
    private String answer;

    public isDivisibleBySteps() {

        Given("3", () -> {
            this.number = 3 ;
//            throw new io.cucumber.java8.PendingException();
        });


        Given("35", () -> {
            this.number = 35;
//            throw new io.cucumber.java8.PendingException();
        });


        Given("15", () -> {
            this.number = 15;
//            throw new io.cucumber.java8.PendingException();
        });


        Given("1", () -> {
            this.number = 1;
//            throw new io.cucumber.java8.PendingException();
        });

        When("I divide by three or five", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.answer = divisibleChecker.checkIfFizzBuzz(this.number);
//            throw new io.cucumber.java8.PendingException();
        });

        Then("I should get (answer)", (String string) -> {
            Assert.assertEquals(string, this.answer);
//            throw new io.cucumber.java8.PendingException();
        });

    }
}

