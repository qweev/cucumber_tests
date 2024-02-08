package wojtek.com;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExamplesixTagsSteps {
    // story 1
    @Given("given tag story 1")
    public void givenTagStory1() {
        System.out.println("tag story1and2");
    }

    @When("when tag story 1")
    public void whenTagStory1() {
        System.out.println("tag story1and2");
    }

    @Then("then tag story 1")
    public void thenTagStory1() {
        System.out.println("tag story1and2");
    }

    // story 2
    @Given("given tag story 2")
    public void givenTagStory2() {
        System.out.println("tag story1and2");
    }

    @When("when tag story 2")
    public void whenTagStory2() {
        System.out.println("tag story1and2");
    }

    @Then("then tag story 2")
    public void thenTagStory2() {
        System.out.println("tag story1and2");
    }

    // story 3
    @Given("given tag story 3")
    public void givenTagStory3() {
        System.out.println("tag story3");

    }

    @When("when tag story 3")
    public void whenTagStory3() {
        System.out.println("tag story3");
    }

    @Then("then tag story 3")
    public void thenTagStory3() {
        System.out.println("tag story3");
    }
}
