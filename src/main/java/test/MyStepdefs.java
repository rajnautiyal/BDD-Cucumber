package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I'm Dummy")
    public void iMDummy() {
        throw new io.cucumber.java.PendingException();
    }

    @When("I do Dummy things")
    public void i_do_dummy_things() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("dummy things happen")
    public void dummy_things_happen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
