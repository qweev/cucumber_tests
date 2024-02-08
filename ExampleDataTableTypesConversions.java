package wojtek.com;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleDataTableTypesConversions {

    // List transformation example
    @Given("a system state with list")
    public void aSystemStateWithList(List<String> animals) {
        System.out.println("List transformation example");
        for (String a:animals){
            System.out.println("animal " + a);
        }
    }

    @When("I do something with list")
    public void iDoSomethingWithList() {
        System.out.println("when ...");
    }

    @Then("system is in a different state with list")
    public void systemIsInADifferentStateWithList() {
        assertEquals(0,0);
    }

    // list of list example
    @Given("a system state with list in list")
    public void aSystemStateWithListInList(List<List<String>> lists) {
        System.out.println("List with list transformation example");
        for(List<String> list: lists){
            System.out.println("List content " + list);
        }
    }

    @When("I do something with list in list")
    public void iDoSomethingWithListInList() {
        System.out.println("when ...");
    }

    @Then("system is in a different state with list in list")
    public void systemIsInADifferentStateWithListInList() {
        assertEquals(0,0);
    }

    // Map transformation example
    @Given("a system state with map")
    public void aSystemStateWithMap(Map<String,String> mapping) {
        System.out.println("Map transformation example");
        for(String m: mapping.keySet()){
            System.out.println("key" + m);
            System.out.println("value" + mapping.get(m));
        }
    }

    @When("I do something with map")
    public void iDoSomethingWithMap() {
        System.out.println("when ...");
    }

    @Then("system is in a different state with map")
    public void systemIsInADifferentStateWithMap() {
        assertEquals(0,0);
    }


    // List map transformation example
    @Given("a system state with list map")
    public void aSystemStateWithListMap(List<Map<String,String>> people) {
        System.out.println("List map transformation example");
        for(Map<String,String> person: people){
            System.out.println("person details: " + person);
        }

    }

    @When("I do something with list map")
    public void iDoSomethingWithListMap() {
        System.out.println("when ...");
    }

    @Then("system is in a different state with list map")
    public void systemIsInADifferentStateWithListMap() {
        assertEquals(0,0);
    }



}
