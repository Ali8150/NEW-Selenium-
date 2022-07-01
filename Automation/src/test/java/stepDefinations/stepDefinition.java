package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on netbanking$")
    public void user_is_on_netbanking() throws Throwable {
     System.out.println("hello");
    }

    @When("^user login into application wit username and password $")
    public void user_login_into_application_wit_username_and_password() throws Throwable {
        
    }

    @Then("^Home page is populated $")
    public void home_page_is_populated() throws Throwable {
        
    }

    @And("^Cards are displayed $")
    public void cards_are_displayed() throws Throwable {
        
    }

}