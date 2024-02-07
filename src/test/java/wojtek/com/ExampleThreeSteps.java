package wojtek.com;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExampleThreeSteps {
    private int a;
    private int b;
    private int sum=0;

    @Given("three variable {int}")
    public void given(int twoFromStory) {
        a = twoFromStory;
    }

    @When("three I add with {int}")
    public void when(int threeFromStory) {
        b = threeFromStory;
    }

    @Then("three system output is {int}")
    public void then(int sumFromStory) {
        sum = a + b;
        assertEquals(sum, sumFromStory);
    }

}
