package wojtek.com;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExampleTwoSteps {
    private int two;
    private int three;
    private int result=0;

    @Given("variable {int}")
    public void given(int twoFromStory) {
        two = twoFromStory;
    }

    @When("I add with {int}")
    public void when(int threeFromStory) {
        three = threeFromStory;
    }

    @Then("system output is {int}")
    public void then(int sumFromStory) {
        result = two + three;
        assertEquals(result, sumFromStory);
    }

}
