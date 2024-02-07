package wojtek.com;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class ExampleOneSteps {
    private int number;
    private String result;

    @Given("a system state")
    public void i_have_entered_number_into_the_calculator() {
        number = 5;
    }

    @When("I do something")
    public void i_press_add() {
        // Assuming you have a Calculator class with an add method
        result = "ok";

    }

    @Then("system is in a different state")
    public void the_result_should_be_result_on_the_screen() {
        assertEquals(0, 0);
    }

}
