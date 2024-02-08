package wojtek.com;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wojtek.com.models.Animal;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleForAnimalObjectConversion {
    // object conversion

    @Given("a system state with object")
    public void aSystemStateWithObject(List<Animal> animals) {
        System.out.println("Object transform from table example");
        System.out.println("Given a system state with object:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    @When("I do something with object")
    public void iDoSomethingWithObject() {
        System.out.println("when..");
    }

    @Then("system is in a different state with object")
    public void systemIsInADifferentStateWithObject() {
        assertEquals(0,0);
    }
}
